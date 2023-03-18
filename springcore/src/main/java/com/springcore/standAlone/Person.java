package com.springcore.standAlone;
import java.util.List;
import java.util.Map;
public class Person {
	private List<String> friends;
	private Map<String,String> course;
	public Map<String, String> getCourse() {
		return course;
	}

	public void setCourse(Map<String, String> course) {
		this.course = course;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}
	
	public List<String> getFriends(){
		return this.friends;
	}
	@Override
	public String toString() {
		return "Person [friends=" + friends + ", course=" + course + "]";
	}
}
