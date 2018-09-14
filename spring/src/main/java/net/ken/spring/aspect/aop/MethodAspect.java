package net.ken.spring.aspect.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * Created by Yang, Haiqiang on 2018/09/13.
 */
@Aspect
@Component
public class MethodAspect {

    @Around("net.ken.spring.aspect.aop.LogPointCut.serviceLayer()")
    public Object advice1(ProceedingJoinPoint pjp) throws Throwable {
        long start = System.currentTimeMillis();
        Object obj = pjp.proceed();
        long end = System.currentTimeMillis();
        System.out.println("service takes " + (end - start) + " ms");
        return obj;
    }

    @Around("net.ken.spring.aspect.aop.LogPointCut.webLayer()")
    public Object advice2(ProceedingJoinPoint pjp) throws Throwable {
        long start = System.currentTimeMillis();
        Object obj = pjp.proceed();
        long end = System.currentTimeMillis();
        System.out.println("web logic takes " + (end - start) + " ms");
        return obj;
    }

    @Before("net.ken.spring.aspect.aop.LogPointCut.annotationMethod()")
    public void advice3() {
        System.out.println("invoke method with @AspectLog");
    }

    /*@AfterReturning("net.ken.spring.aspect.aop.LogPointCut.allLayer()")
    public void advice4(){
        System.out.println("invoke method");
    }*/

}
