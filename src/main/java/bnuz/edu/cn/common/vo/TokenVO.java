package bnuz.edu.cn.common.vo;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Author: Cai
 * @CreateTime: 2021/10/21
 */
@Data
@Component
@PropertySource(value = "classpath:application.yml")
@ConfigurationProperties(prefix = "weixin.auth")
public class TokenVO {
    private String url;
    private String appid;
    private String appsecret;
}
