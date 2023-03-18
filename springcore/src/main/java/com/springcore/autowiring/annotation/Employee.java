package com.springcore.autowiring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	@Autowired
	@Qualifier("add")
	private Address address;
	String name;
	int age;
	
	
	public Employee(Address address, String name,int age) {
		this.address = address;
		this.name = name;
		this.age = age;
	}
	public Employee() {
		super();
	}
	
	public Address getAddress() {
		return address;
	}
	
	
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String toString() {
		return "Employee = ["+this.address+"] name = {"+this.name+"} age = "+this.age ;
	}
}

