package bnuz.edu.cn.common.config;

import bnuz.edu.cn.common.utils.SpringUtil;
import bnuz.edu.cn.common.utils.TokenUtil;
import bnuz.edu.cn.common.vo.AccessTokenVO;
import bnuz.edu.cn.common.vo.TokenVO;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.time.LocalDateTime;

/**
 * @Description:
 * @Author: Cai
 * @CreateTime: 2021/10/21
 */
@Getter
@Configuration
@EnableScheduling
@Slf4j
public class AuthScheduleConfig {
    public static String accessToken;
    @Autowired
    private TokenVO tokenVO;

    /**
     * 每隔 fixedDelay/1000 秒定时刷新
     * 6000000 为100分钟,时限为120分钟
     */
//    @Scheduled(fixedDelay = 6000000)
//    private void configureTasks() {
//        AccessTokenVO token = TokenUtil.getAccessToken(tokenVO);
//        accessToken = token.getAccess_token();
//        log.info("令牌为: " + accessToken + "  执行定时任务: " + LocalDateTime.now());
//    }
}
