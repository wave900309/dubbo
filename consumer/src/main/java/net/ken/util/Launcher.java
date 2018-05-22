package net.ken.util;

import net.ken.service.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Yang, Haiqiang on 2018/05/16.
 */
public class Launcher {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] { "classpath:consumer.xml" });
        context.start();
        DemoService demoService = (DemoService) context.getBean("demoService");
        System.out.println(demoService.foo());
    }
}
