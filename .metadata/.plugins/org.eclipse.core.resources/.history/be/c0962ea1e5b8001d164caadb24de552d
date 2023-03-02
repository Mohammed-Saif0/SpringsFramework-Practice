package com.springcoreCollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("com/springcoreCollection/collectionconfig.xml");
		Emp emp1 = (Emp)con.getBean("emp1");
		System.out.println(emp1);
	}
}
