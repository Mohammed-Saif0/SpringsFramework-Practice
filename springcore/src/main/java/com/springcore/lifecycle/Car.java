package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Car implements InitializingBean,DisposableBean{
	private String color;
	public void setColor(String color) {
		this.color = color;
	}
	
	public String toString() {
		return "Car's color = ["+color+"]";
	}
	
	public void destroy() throws Exception{
		System.out.println("Car is been destroyed");
	}
	
	public void afterPropertiesSet() throws Exception{
		System.out.println("car Have been init");
	}
}
