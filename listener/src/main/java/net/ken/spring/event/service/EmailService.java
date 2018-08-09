package net.ken.spring.event.service;

import net.ken.spring.event.model.LoginEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by Yang, Haiqiang on 2018/06/20.
 */
@Service
public class EmailService implements ApplicationListener<LoginEvent> {
    @Override
    public void onApplicationEvent(LoginEvent event) {
        System.out.println("received login event, user=" + event.getSource() + ", time=" + new Date().getTime());
    }
}
