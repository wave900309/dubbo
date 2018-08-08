package net.ken.util;

import net.ken.service.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by Yang, Haiqiang on 2018/05/16.
 */
public class Launcher {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] { "classpath:consumer.xml" });
        context.start();
        DemoService demoService = context.getBean("demoService", DemoService.class);
        while (System.in.read() == 1){
            String foobar = demoService.foo();
            System.out.print(foobar);
        }
    }
}
