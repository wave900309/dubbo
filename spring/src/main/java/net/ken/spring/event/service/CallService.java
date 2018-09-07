package net.ken.spring.event.service;

import net.ken.spring.event.model.LoginEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

/**
 * Created by Yang, Haiqiang on 2018/08/21.
 */
@Service
public class CallService {

    @EventListener(condition = "#root.event.getUser() == 'kensan'")
    public void makeCall(LoginEvent event){
        System.out.println("Calling " + event.getUser());
    }
}
