package com.demo.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("hi world!!!");
		System.out.println("ice cream");
		System.out.println("heloo");
		Pro.One();
		Pro1.One();
		Pro2.m1();
	}

}
