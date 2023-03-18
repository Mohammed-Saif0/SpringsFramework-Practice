package com.springcore.standAlone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext	context = new ClassPathXmlApplicationContext("com/springcore/standAlone/config.xml");
		Person person1 = (Person) context.getBean("person1");
		System.out.println(person1.getCourse());
	}
}
