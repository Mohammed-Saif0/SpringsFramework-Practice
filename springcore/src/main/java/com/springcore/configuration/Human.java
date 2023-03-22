package com.springcore.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("human")
public class Human {
	@Value("Mohammed saif")
	private String name;
	@Value("21")
	private int age;
	private Address address;
	public Address getAddress() {
		return address;
	}
	@Autowired
	@Qualifier("add")
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
	@Override
	public String toString() {
		return "Human [name=" + name + ", age=" + age + ", address=" + address + "]";
	}
	
}
