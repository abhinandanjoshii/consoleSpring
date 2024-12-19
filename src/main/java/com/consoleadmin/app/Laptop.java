package com.consoleadmin.app;

import org.springframework.stereotype.Component;

@Component
public class Laptop {

    //initialise value in the xml properties
    public Laptop(){
        System.out.println("Laptop Object Created");
    }

    public void compile()
    {
        System.out.println("Compiling");
    }

}
