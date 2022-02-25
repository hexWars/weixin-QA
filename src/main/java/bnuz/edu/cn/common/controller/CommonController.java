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

    @GetMapping("/index")
    @ApiOperation("首页")
    public String index() {
        return "index";
    }

    @GetMapping("/welcome")
    @ApiOperation("欢迎页")
    public String welcome() {
        return "welcome";
    }

    @GetMapping("/captcha")
    @ApiOperation("验证码")
    public void happyCaptcha(HttpServletRequest request, HttpServletResponse response){
        HappyCaptcha.require(request,response).build().finish();
    }

    @GetMapping("/setting")
    @ApiOperation("设置")
    public String setting(){ return "setting";}

}
