package com.consoleadmin.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootDemoApplication.class, args);

		Alien obj1 = context.getBean(Alien.class);
		obj1.Code();
		// 2 dif reference , same object reference it will go.
		//bydefault singleton object, else we need to create
		obj1.setAge(21);
		System.out.println(obj1.getAge());
		System.out.println(obj1.hashCode());

//		Alien obj2 = context.getBean(Alien.class);
//		obj2.Code();
//		System.out.println(obj2.age);

	}

}
