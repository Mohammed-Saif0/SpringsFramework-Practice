package com.springcoreCollection;

import com.springcore.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;

public class Main {
	public static void main(String[] args) {
//		File f = new File("src/main/java/com/springcoreCollection/collectionconfig.xml");
//		System.out.println(f.exists());
		ApplicationContext con = new ClassPathXmlApplicationContext("classpath:src/main/java/config.xml");
		Student student1 = (Student) con.getBean("student1");
		System.out.println(student1);
	}
}
