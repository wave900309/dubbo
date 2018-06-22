package net.ken.spring.listener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by Yang, Haiqiang on 2018/06/20.
 */
@Service
public class LoginService {

    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    public void login(String user) {
        System.out.println("publishing login event, user=" + user + ", time=" + new Date().getTime());
        applicationEventPublisher.publishEvent(new LoginEvent(user));
    }
}
