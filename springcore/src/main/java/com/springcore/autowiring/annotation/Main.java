package com.springcore.autowiring.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main{
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/autowiring/annotation/autoConfig.xml");
		Employee emp = (Employee) context.getBean("emp1");
		Employee emp1 = (Employee) context.getBean("emp1");
		System.out.println(emp.hashCode());
		System.out.println(emp1.hashCode());
	}
}