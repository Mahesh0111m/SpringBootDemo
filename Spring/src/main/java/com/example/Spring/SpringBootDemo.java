package com.example.Spring;

import com.example.Spring.ServerExample.Demo;
import com.example.Spring.ServiceExample.ServiceDemo;
//import jdk.internal.icu.text.UnicodeSet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootDemo {

	public static void main(String[] args)
	{
		//SpringApplication.run(SpringBootDemo.class, args);

		//normal way of creating object
//		example obj= new example();
//		obj.code();

		//if we want spring to create the objects then for which class we need to create
		//objects we must specify with annotations which is in this case is component
		//because spring will not create objects creates only when we specify for which
		//class we need then spring creates the objects
		//here we need objects for example class so specify a component annotation


		//using spring to create ojects

		//first take returned value from SpringApplication.run(SpringBootDemo.class, args);
		//because using application context it creates bean

		ApplicationContext context = SpringApplication.run(SpringBootDemo.class, args);
//			example obj= context.getBean(example.class);
//			obj.code();

		ServiceDemo service = context.getBean(ServiceDemo.class);

		Demo obj = context.getBean(Demo.class);

		service.process(obj);



	}


}
