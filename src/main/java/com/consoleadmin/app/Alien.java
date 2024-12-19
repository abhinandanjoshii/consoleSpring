package com.consoleadmin.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Alien {

    int age;
    // auto wiring required for mapping object.
    @Autowired
    Laptop laptop;

    public void Code(){
        laptop.compile();
        System.out.println("Coding");
    }

}
