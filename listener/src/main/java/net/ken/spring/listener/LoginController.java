package net.ken.spring.listener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by Yang, Haiqiang on 2018/06/20.
 */
@RestController
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
