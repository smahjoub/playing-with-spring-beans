package com.smahjoub.beans.components;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class PrototypeBean {
    private long instantiationTime;


    public PrototypeBean(){
        instantiationTime = System.currentTimeMillis();
    }

    public long getInstantiationTime(){
        return instantiationTime;
    }
}
