
package com.javatechsoft.di.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;


@Component
public class ClassKLM {

    @Autowired
    @Qualifier("classABC")
    InterfacePQR obj;

    @PostConstruct
    public void init() {
        obj.display();
    }
}
