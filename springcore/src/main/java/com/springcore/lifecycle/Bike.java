package com.springcore.lifecycle;

public class Bike {
	private double price;
	public double getPrice() {
		return this.price;
	}
	public void setPrice(double price) 	{
		System.out.println("Setting price , inside the setter method");
		this.price = price;
	}
	
	public String toString() {
		return "price = [ "+this.price+" ]";
	}
	
	public void init() {
		System.out.println("Inside init method");
	}
	
	public void destroy() {
		System.out.println("Inside destroy method");
	}
}
