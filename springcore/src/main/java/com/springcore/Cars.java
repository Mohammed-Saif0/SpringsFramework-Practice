package com.springcore;

import java.util.Arrays;

public class Cars {
	int carId;
	String[] carColors;
	int year;
	@Override
	public String toString() {
		return "Cars [carId=" + carId + ", carColors=" + Arrays.toString(carColors) + ", year=" + year + "]";
	}
	public int getCarId() {
		return carId;
	}
	public void setCarId(int carId) {
		this.carId = carId;
	}
	public String[] getCarColors() {
		return carColors;
	}
	public void setCarColors(String[] carColors) {
		this.carColors = carColors;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}

}
