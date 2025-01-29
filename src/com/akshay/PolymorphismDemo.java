package com.akshay;

public class PolymorphismDemo {
	public static void main(String[] args) { 
		//byte,short,int,long,float,double
		int a=10;
		float f=a; // implicit casting
		float f1=12;
		int b=(int) f1; //explicit casting
		
		CompiletimeDemo c= new CompiletimeDemo();
		c.m1(10);
		
	}

}
class CompiletimeDemo{
	void m1() {
		System.out.println("Inside No arg");
	}
	//void m1(int a) {
		//System.out.println("Inside int");
	//}
	//void m1(float b) {
		//System.out.println("inside float ");
	//}
	void m1(int a ,int b) {
		System.out.println("inside int int");
	}
	void m1(int a,float b) {
		System.out.println("inside int float");
	}
	void m1(float b,int a) {
		System.out.println("inside float,int");
	}
	//void m1(double a) {
		//System.out.println("Inside double");
	//}
	//void m1(Integer c) {
		//System.out.println("Inside Integer");
	//}
	//void m1( Number n) {
		//System.out.println("Inside Number");
	//}
	void m1(Object o) {
		System.out.println("Inside Object");
	}
	
	
}

