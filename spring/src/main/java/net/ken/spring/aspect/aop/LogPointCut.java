package net.ken.spring.aspect.aop;

import org.aspectj.lang.annotation.Pointcut;

/**
 * Created by Yang, Haiqiang on 2018/09/13.
 */
public class LogPointCut {

    @Pointcut("execution(void net.ken.spring.aspect.service.AspectLogService.soutDay(..))")
    public void serviceLayer() {

    }

    @Pointcut("within(net.ken.spring.aspect.controller..*) && execution(* l*(..))")
    public void webLayer() {

    }

    @Pointcut("@annotation(net.ken.spring.aspect.model.AspectLog)")
    public void annotationMethod() {

    }

    @Pointcut("within(net.ken.spring..*)")
    public void allLayer() {

    }
}
