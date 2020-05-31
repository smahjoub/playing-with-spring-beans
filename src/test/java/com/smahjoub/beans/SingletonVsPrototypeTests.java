package com.smahjoub.beans;

import com.smahjoub.beans.components.PrototypeBean;
import com.smahjoub.beans.components.SingletonBean;
import com.smahjoub.beans.configurations.SimpleConfiguration;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

public class SingletonVsPrototypeTests {

    @Test
    public void testSingletonShouldBeTheSame(){
        var ctx = new AnnotationConfigApplicationContext(SimpleConfiguration.class);

        var singletonBean =  ctx.getBean(SingletonBean.class);
        assertNotNull(singletonBean);

        var singletonBean2 =  ctx.getBean(SingletonBean.class);
        assertNotNull(singletonBean2);
        assertEquals(singletonBean, singletonBean2);

    }


    @Test
    public void prototypeShouldNotBeTheSame(){
        var ctx = new AnnotationConfigApplicationContext(SimpleConfiguration.class);


        var prototypeBean =  ctx.getBean(PrototypeBean.class);
        assertNotNull(prototypeBean);

        var prototypeBean2 =  ctx.getBean(PrototypeBean.class);
        assertNotNull(prototypeBean2);

        assertNotEquals(prototypeBean, prototypeBean2);
    }
}
