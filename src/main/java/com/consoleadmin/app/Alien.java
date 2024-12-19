package com.consoleadmin.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Alien {

    private int age;
    // auto wiring required for mapping object.
    @Autowired
    Laptop laptop;

    public int getAge() {
        return age;
    }

    //setter injection
    public void setAge(int age) {
        this.age = age;
    }

    public void Code(){
        laptop.compile();
        System.out.println("Coding");
    }

}
