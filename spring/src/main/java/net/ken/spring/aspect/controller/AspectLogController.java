package net.ken.spring.aspect.controller;

import net.ken.spring.aspect.service.AspectLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created by Yang, Haiqiang on 2018/09/13.
 */
@RestController
@RequestMapping("aspect")
public class AspectLogController {

    @Autowired
    private AspectLogService aspectLogService;

    @RequestMapping(path = "/log")
    public String log(Date date) {
        aspectLogService.soutDay(date);
        return "success";
    }

    @RequestMapping("/log2")
    public String log2() {
        aspectLogService.soutMs(new Date());
        return "success";
    }
}
