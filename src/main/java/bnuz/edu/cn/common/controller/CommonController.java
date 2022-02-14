package bnuz.edu.cn.common.controller;

import com.ramostear.captcha.HappyCaptcha;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Description:
 * @Author: Cai
 * @CreateTime: 2022/2/13
 */

@Controller
@Api(tags = "全局控制类")
public class CommonController {

    @GetMapping("/login")
    @ApiOperation("登录页面")
    public String login() {
        return "login";
    }

    @GetMapping("/captcha")
    @ApiOperation("验证码")
    public void happyCaptcha(HttpServletRequest request, HttpServletResponse response){
        HappyCaptcha.require(request,response).build().finish();
    }

}
