package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		AbstractApplicationContext con = new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");
		// Registering shut down hook to enable destroy method
		con.registerShutdownHook();
//		Bike b1 = (Bike) con.getBean("bike1");
//		System.out.print(b1);
		
//		Car c1 = (Car) con.getBean("car1");
//		System.out.println(c1);
		
		truck t1 = (truck) con.getBean("truck1");
		System.out.println(t1);
	}
}
	