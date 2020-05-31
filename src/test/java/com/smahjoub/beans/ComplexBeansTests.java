package com.smahjoub.beans;

import com.smahjoub.beans.components.ComplexSingletonBean;
import com.smahjoub.beans.configurations.SimpleConfiguration;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ComplexBeansTests {


    @Test
    public void singletonWithInjectedPrototypeShouldBeTheSame(){
        var ctx = new AnnotationConfigApplicationContext(SimpleConfiguration.class);

        var complexSingletonBean =  ctx.getBean(ComplexSingletonBean.class);
        assertNotNull(complexSingletonBean);

        var complexSingletonBean2 =  ctx.getBean(ComplexSingletonBean.class);
        assertNotNull(complexSingletonBean);

        assertEquals(complexSingletonBean, complexSingletonBean2);

        assertEquals(complexSingletonBean.getPrototypeBean(), complexSingletonBean2.getPrototypeBean());
    }
}
