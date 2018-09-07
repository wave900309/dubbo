package net.ken.spring.event.model;

import org.springframework.context.ApplicationEvent;

/**
 * Created by Yang, Haiqiang on 2018/06/20.
 */
public class LoginEvent extends ApplicationEvent {

    public String user;

    /**
     * Create a new ApplicationEvent.
     * @param source the object on which the event initially occurred (never {@code null})
     */
    public LoginEvent(Object source, String user) {
        super(source);
        this.user = user;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
}
