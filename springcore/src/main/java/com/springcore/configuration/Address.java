package com.springcore.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("add")
public class Address {
	@Value("Karnataka")
	private String state;
	@Value("Bangalore")
	private String city;
	@Value("India")
	private String country;
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Address [state=" + state + ", city=" + city + ", country=" + country + "]";
	}
	
}
