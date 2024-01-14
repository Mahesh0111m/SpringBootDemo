package com.example.Spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootDemo {

	public static void main(String[] args)
	{
		SpringApplication.run(SpringBootDemo.class, args);

		//normal way of creating object
		example obj= new example();
		obj.code();

	}

}
