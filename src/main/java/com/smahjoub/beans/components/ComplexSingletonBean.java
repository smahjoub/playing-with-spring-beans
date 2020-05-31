package com.smahjoub.beans.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class ComplexSingletonBean {

    private final PrototypeBean prototypeBean;

    @Autowired
    public ComplexSingletonBean(PrototypeBean prototypeBean){
        this.prototypeBean = prototypeBean;
    }

    public PrototypeBean getPrototypeBean() {
        return prototypeBean;
    }
}
