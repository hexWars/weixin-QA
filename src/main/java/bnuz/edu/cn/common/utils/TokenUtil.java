package bnuz.edu.cn.common.utils;

import bnuz.edu.cn.common.vo.AccessTokenVO;
import bnuz.edu.cn.common.vo.TokenVO;
import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * @Description:
 * @Author: Cai
 * @CreateTime: 2021/10/21
 */
@Slf4j
public class TokenUtil {


    /**
     * 获取 token
     *
     * @return AccessTokenVO
     */
    public static AccessTokenVO getAccessToken(TokenVO tokenVO) {
        log.info("tokenVO: " + tokenVO);
        String json = loadJson(tokenVO.getUrl() + "/api/third/get-token?appid=" + tokenVO.getAppid() + "&appsecret=" + tokenVO.getAppsecret());
        log.info("returned json: " + json);
        JSONObject jsonObject = JSONObject.parseObject(json);
        if (Integer.parseInt(jsonObject.getString("e")) != 0) {
            log.info("错误信息: "+jsonObject.getString("m"));
            return refreshToken(tokenVO);
        }
        AccessTokenVO token = JSONObject.parseObject(json).getObject("d", AccessTokenVO.class);
        log.info("获取令牌: " + token.getAccess_token() + "   时长为: " + token.getExpires_in());
        return token;
    }

    /**
     * 刷新token
     *
     * @return AccessTokenVO
     */
    public static AccessTokenVO refreshToken(TokenVO tokenVO) {
        String json = loadJson(tokenVO.getUrl() + "/api/third/refresh-token?appid=" + tokenVO.getAppid() + "&appsecret=" + tokenVO.getAppsecret());
        JSONObject jsonObject = JSONObject.parseObject(json);
        if (Integer.parseInt(jsonObject.getString("e")) == 0) {
            AccessTokenVO token = JSONObject.parseObject(json).getObject("d", AccessTokenVO.class);
            log.info("获取令牌: " + token.getAccess_token() + "   时长为: " + token.getExpires_in());
            return token;
        } else {
            log.error("Token异常: " + jsonObject.getString("m"));
            return null;
        }
    }

    /**
     * 将url获取的json返回
     *
     * @param url
     * @return json字符串
     */
    public static String loadJson(String url) {
        StringBuilder json = new StringBuilder();
        try {
            java.net.URL urlObject = new URL(url);
            URLConnection uc = urlObject.openConnection();
            BufferedReader in = new BufferedReader(new InputStreamReader(uc.getInputStream()));
            String inputLine = null;
            while ((inputLine = in.readLine()) != null) {
                json.append(inputLine);
            }
            in.close();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return json.toString();
    }
}
