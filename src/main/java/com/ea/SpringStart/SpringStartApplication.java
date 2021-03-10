package com.ea.SpringStart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class SpringStartApplication {


	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringStartApplication.class, args);
		var car = context.getBean(Car.class);
		car.getCar();
	}
}
