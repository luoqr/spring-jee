package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSpring {

	public static void main(String[] args){
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfiguration.class);
		CustomerService service = ctx.getBean(CustomerService.class);
		System.out.println(service);
	}
	
}
