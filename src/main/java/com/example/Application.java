package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		System.out.println("Hi"); // Added print statement
		int k = 1;
		if(k == 0){
			System.out.println("is zero");
		}
		else{
			System.out.println("hi");
		}
	}

}
