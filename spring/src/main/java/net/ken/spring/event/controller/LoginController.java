package net.ken.spring.event.controller;

import net.ken.spring.event.constant.OS;
import net.ken.spring.event.service.LoginService;
import org.hibernate.validator.constraints.Length;
import org.springframework.context.annotation.Profile;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.constraints.NotNull;

/**
 * Created by Yang, Haiqiang on 2018/06/20.
 */
@RestController
@Validated
@RequestMapping("login")
public class LoginController {

    @Resource
    private LoginService loginService;

    @RequestMapping("/login")
    public String login(@NotNull @Length(min = 5) String user, OS os) {
        System.out.println("login from " + os);
        loginService.login(user);
        return "success";
    }
}
