package net.ken.spring.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Yang, Haiqiang on 2018/08/09.
 */
@RestController
@RequestMapping("singleton")
public class SingletonController {

    @Autowired
    private IScoped scoped;

    @RequestMapping("/nothing")
    public String nothing() {
        System.out.println(this);
        return "success";
    }

    @RequestMapping("/print")
    public String print() {
        System.out.println(scoped);
        System.out.println(scoped.getTime());
        return "success";
    }

}
