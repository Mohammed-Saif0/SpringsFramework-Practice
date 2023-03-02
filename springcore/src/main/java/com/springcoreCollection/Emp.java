package com.springcoreCollection;
import java.util.*;


public class Emp {
	public String name;
	private List<Integer> phone;
	private Set<String> address;
	private Map<String,String> courses;
	public Properties pros;
	public Properties getPros() {
		return pros;
	}
	public void setPros(Properties pros) {
		this.pros = pros;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Integer> getPhone() {
		return phone;
	}
	public void setPhone(List<Integer> phone) {
		this.phone = phone;
	}
	public Set<String> getAddress() {
		return address;
	}
	public void setAddress(Set<String> address) {
		this.address = address;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}
	@Override
	public String toString() {
		return "Emp [name=" + name + ", phone=" + phone + ", address=" + address + ", courses=" + courses + ", pros="
				+ pros + "]";
	}
	
	
}
