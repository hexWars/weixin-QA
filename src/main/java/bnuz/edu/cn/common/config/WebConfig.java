package bnuz.edu.cn.common.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Description:
 * @Author: Cai
 * @CreateTime: 2022/2/21
 */
@Configuration
public class WebConfig implements WebMvcConfigurer{

    @Autowired
    @Qualifier(value = "loginInterceptor")
    private HandlerInterceptor handlerInterceptor;

    /**
     * 注册拦截器
     *
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        InterceptorRegistration registration = registry.addInterceptor(handlerInterceptor);
        //拦截路径
        registration.addPathPatterns("/**");
        //放行路径
        registration.excludePathPatterns(
                "/login",
                "/captcha",
                "/user/login",
                "/user/logout",
                "/layui/**",
                "/lib/**",
                "/spi/**",
                "/css/**",
                "/images/**",
                "/js/**"
                ,"/error"
                ,"/lswagger-ui"
                ,"/lo"
                ,"/emp**/**"

                ,"/swagger**/**"
                ,"/webjars/**"
                ,"/v2/**"
                ,"/favicon.ico"
        );

        WebMvcConfigurer.super.addInterceptors(registry);
    }
}
