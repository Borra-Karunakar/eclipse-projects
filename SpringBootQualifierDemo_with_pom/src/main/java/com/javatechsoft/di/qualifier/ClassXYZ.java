
package com.javatechsoft.di.qualifier;

import org.springframework.stereotype.Component;

@Component
public class ClassXYZ implements InterfacePQR {
    public void display() {
        System.out.println("Hi.. I am ClassXYZ");
    }
}
