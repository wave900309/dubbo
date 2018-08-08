package net.ken.spring.post;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

/**
 * Created by Yang, Haiqiang on 2018/08/01.
 */
@Component
public class PrintInfoBeanPostProcessor implements BeanPostProcessor, Ordered {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public int getOrder() {
        return Integer.MIN_VALUE;
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        logger.info("Bean [{}] initialization finish !", beanName);
        return bean;
    }
}
