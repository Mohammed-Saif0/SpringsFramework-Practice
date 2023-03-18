package com.spring.autowiring.constructor;

public class Addition {
	int a ,b;
	
	Addition(int a, int b){
		System.out.println("a = "+a+" b = "+b);
		System.out.println("int : int constructor");
	}
	
	Addition(double a, double b) {
		System.out.println("a = "+a+" b = "+b);
		System.out.print("double : double constructor");
	}
	
	Addition(String a, String b){
		System.out.println("a = "+a+" b = "+b);
		System.out.println("String:string constructor");
	}

	public void add(){
		System.out.println(a+b+" this is the addition");
	}
}
