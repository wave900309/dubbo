package net.ken.spring.listener;

import org.springframework.context.ApplicationEvent;

/**
 * Created by Yang, Haiqiang on 2018/06/20.
 */
public class LoginEvent extends ApplicationEvent {
    /**
     * Create a new ApplicationEvent.
     * @param source the object on which the event initially occurred (never {@code null})
     */
    public LoginEvent(Object source) {
        super(source);
    }
}
