package com.ninemax.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Consumer {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("dubbo-demo-consumer.xml");
		context.start();
		DemoService demoService = (DemoService) context.getBean("demoService");
		String msg = demoService.sayHello("world");
		System.out.println(msg);
	}
}
