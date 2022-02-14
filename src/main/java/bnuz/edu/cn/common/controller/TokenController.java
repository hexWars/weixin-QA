package bnuz.edu.cn.common.controller;

import bnuz.edu.cn.common.config.AuthScheduleConfig;
import bnuz.edu.cn.common.vo.TokenVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description:
 * @Author: Cai
 * @CreateTime: 2021/10/28
 */
@Controller
public class TokenController {
    @Autowired
    TokenVO tokenVO;

//    @GetMapping("/???")
//    public String school() {
//        return "redirect:" + tokenVO.getUrl() + "/uc/api/user/department?" + "access_token=" + AuthScheduleConfig.accessToken;
//    }
}
