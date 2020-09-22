package com.proj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoProjectApplication 
{
	public static void main(String[] args) 
	{
		SpringApplication.run(DemoProjectApplication.class, args);
		System.out.println("SPRING BOOT APPLICATION STARTS");
	}

}
