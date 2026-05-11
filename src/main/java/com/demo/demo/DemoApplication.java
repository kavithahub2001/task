package com.demo.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		List<Integer> l= new ArrayList<>();
		l.add(1);
		Pro.One();
		System.out.println(l);
		System.out.println("amed");
		System.out.println("hi world!!!");
		System.out.println("ice cream");
		System.out.println("heloo");
		int a=100;
		System.out.println(a);
	}

}
