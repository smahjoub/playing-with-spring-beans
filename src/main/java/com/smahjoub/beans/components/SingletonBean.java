package com.smahjoub.beans.components;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class SingletonBean {

    private long instantiationTime;


    public SingletonBean(){
        instantiationTime = System.currentTimeMillis();
    }

    public long getInstantiationTime(){
        return instantiationTime;
    }
}
