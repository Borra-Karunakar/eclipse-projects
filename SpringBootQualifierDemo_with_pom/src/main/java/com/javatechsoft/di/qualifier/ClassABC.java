
package com.javatechsoft.di.qualifier;

import org.springframework.stereotype.Component;

@Component
public class ClassABC implements InterfacePQR {
    public void display() {
        System.out.println("Hi.. I am ClassABC");
    }
}
