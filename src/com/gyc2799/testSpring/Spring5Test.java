package com.gyc2799.testSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Spring5Test {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationcontext.xml");
		HelloWorld helloWorld = (HelloWorld)ctx.getBean("helloWorld");
		helloWorld.Test();
	}
}
