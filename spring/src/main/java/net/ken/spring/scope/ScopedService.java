package net.ken.spring.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by Yang, Haiqiang on 2018/08/09.
 */
@Service
@Scope(scopeName = "prototype", proxyMode = ScopedProxyMode.INTERFACES)
public class ScopedService implements IScoped {
    private Date date = new Date();

    public String getTime() {
        return date.toString();
    }
}
