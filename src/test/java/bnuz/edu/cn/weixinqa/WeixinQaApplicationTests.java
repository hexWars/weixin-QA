package bnuz.edu.cn.weixinqa;

import bnuz.edu.cn.common.utils.TokenUtil;
import bnuz.edu.cn.common.vo.AccessTokenVO;
import bnuz.edu.cn.common.vo.TokenVO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class WeixinQaApplicationTests {
    public static String accessToken;
    @Autowired
    private TokenVO tokenVO;

    @Test
    void contextLoads() {

    }

    @Test
    void loadToken() {
        AccessTokenVO token = TokenUtil.getAccessToken(tokenVO);
        accessToken = token.getAccess_token();
    }

}
