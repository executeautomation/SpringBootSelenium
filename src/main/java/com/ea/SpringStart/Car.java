package com.ea.SpringStart;

import org.springframework.stereotype.Component;

@Component
public class Car {


    public Car() {
        System.out.println("com.ea.SpringStart.Car instantiated");
    }

    public void getCar() {
        System.out.println("Toyota");

    }
}
