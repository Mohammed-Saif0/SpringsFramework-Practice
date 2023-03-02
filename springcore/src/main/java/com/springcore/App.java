package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        
        Student studen1 = (Student) context.getBean("student1");
        Student student2 = (Student) context.getBean("student2");
        Student student3 =(Student) context.getBean("student3");
        System.out.print(student3);
    }
}
