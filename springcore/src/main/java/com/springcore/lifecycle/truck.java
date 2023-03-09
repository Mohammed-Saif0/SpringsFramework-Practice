package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class truck {
	double size;
	
	public void setSize(double size) {
		this.size = size;
	}
	
	public String toString() {
		return "Truck's size = ["+this.size+"]";
	}
	@PostConstruct
	public void start() {
		System.out.println("Init method");
	}
	@PreDestroy
	public void end() {
		System.out.println("Destroy method");
	}
}
