package net.ken.spring.event.controller;

import net.ken.spring.event.service.LoginService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by Yang, Haiqiang on 2018/06/20.
 */
@RestController
@RequestMapping("login")
public class LoginController {

    @Resource
    private LoginService loginService;

    @RequestMapping("/login")
    public String login() {
        loginService.login("kensan");
        System.out.println("login");
        return "success";
    }
}
