package net.ken.spring.aspect.service;

import net.ken.spring.aspect.model.AspectLog;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by Yang, Haiqiang on 2018/09/13.
 */
@Service
public class AspectLogService {

    public void soutDay(Date date) {
        System.out.println(date);
    }

    @AspectLog
    public void soutMs(Date date) {
        System.out.println(System.currentTimeMillis());
    }
}
