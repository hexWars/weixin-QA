package bnuz.edu.cn;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.oas.annotations.EnableOpenApi;

@EnableOpenApi
@SpringBootApplication
@MapperScan("bnuz.edu.cn.*.mapper")
public class WeixinQaApplication {
    public static void main(String[] args) {
        SpringApplication.run(WeixinQaApplication.class, args);
    }
}
