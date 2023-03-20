package practice.springcore.lifeCycle;


import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("person1")

public class Person{
	@Value("#{new java.lang.String('This is string method')}")
	private String name;
	@Value("#{T(Math).sqrt(25)}")
	private int age;
	@Autowired
	@Qualifier("address")
	private Address address;
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
		return "Person [name=" + name + ", age=" + age + ", address=" + address + "]";
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@PostConstruct
	public void init() {
		System.out.println("Person object init started");
	}
	@PreDestroy
	public void destroy() {
		System.out.println("Person object destroyed");
	}

}