package com.springcore.stereotype;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("obj")
@Scope("prototype")
public class Student {
	@Value("Mohammed Saif")
	private String name;
	@Value("21")
	private int age;
	@Value("Computer Science and Engineering")
	private String course;
	@Value("#{myList}")
	private List<Integer> marks;
	@Value("#{myMap}")
	private Map<String,String> paidCourses;
	
	public Map<String, String> getPaidCourses() {
		return paidCourses;
	}
	public void setPaidCourses(Map<String, String> paidCourses) {
		this.paidCourses = paidCourses;
	}
	
	
	public List<Integer> getMarks() {
		return marks;
	}
	public void setMarks(List<Integer> marks) {
		this.marks = marks;
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
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", course=" + course + ", marks=" + marks + ", paidCourses="
				+ paidCourses + "]";
	}
	
	
}