package bnuz.edu.cn.common.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.ArrayList;

/**
 * @Description: Swagger 配置类
 * @Author: Cai
 * @CreateTime: 2021/10/21
 */
@Configuration
public class SwaggerConfig {
    @Bean
    public Docket docket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("全局")
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("bnuz.edu.cn.weixinqa"))
                .build()
                ;
    }

    @Bean
    public Docket docket1() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("提问")
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("bnuz.edu.cn.weixinqa"))
                .build()
                ;
    }

    @Bean
    public Docket docket2() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("回答")
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("bnuz.edu.cn.weixinqa"))
                .build()
                ;
    }

    private ApiInfo apiInfo() {
        Contact contact = new Contact("Cai", "https://blog.csdn.net/Dueser?spm=1000.2115.3001.5343", "1322423005@qq.com");
        return new ApiInfo("Q&A系统"
                , "企业微信号Q&A系统"
                , "0.0.1"
                , "http://www.baidu.com/"
                , contact
                , "Apache 2.0"
                , "http://www.baidu.com/"
                , new ArrayList()
        );
    }
}
