package com.ninemax.demo;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoServiceImpl implements DemoService{

	public String sayHello(String name) {
		return "Hello" + name;
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("dubbo-demo-provider.xml");
		context.start();
		System.in.read();
	}
}
