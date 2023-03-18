package com.spring.autowiring.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext con =  new ClassPathXmlApplicationContext("file:src/main/java/com/spring/constructor/config.xml");
		Addition add = (Addition)con.getBean("add");
		add.add();
	}
}
