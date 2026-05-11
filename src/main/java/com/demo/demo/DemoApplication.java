package com.demo.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("hi world!!!");
		System.out.println("ice cream");
		System.out.println("heloo");
		List<Integer> l= new ArrayList<>();
		System.out.println("amed");
	}

}
