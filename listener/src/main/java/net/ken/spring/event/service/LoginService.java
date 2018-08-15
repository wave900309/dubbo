package net.ken.spring.event.service;

import net.ken.spring.event.model.LoginEvent;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.Date;

/**
 * Created by Yang, Haiqiang on 2018/06/20.
 */
@Profile("dev")
@Service
public class LoginService implements ApplicationContextAware, BeanNameAware, MessageSourceAware {

    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    @Inject
    private MockService mockService;

    private ApplicationContext ctx = null;

    public void login(String user) {
        System.out.println("publishing login event, user=" + user + ", time=" + new Date());
        applicationEventPublisher.publishEvent(new LoginEvent(user));
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        ctx = applicationContext;
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("");
    }

    @Override
    public void setMessageSource(MessageSource messageSource) {
        System.out.println("");
    }

}