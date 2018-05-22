package net.ken.util;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Yang, Haiqiang on 2018/05/16.
 */
public class Launcher {

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] { "classpath:provider.xml" });
        context.start();
        System.in.read(); // 按任意键退出
    }
}
