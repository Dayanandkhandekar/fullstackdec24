package com.sakshiDemo;

public class PolymorphismDemo {
	public static void main(String[] args) {
		PolymorphismDemo1 a=new PolymorphismDemo1();
		a.m1(34);
	}

}
class PolymorphismDemo1{
	void m1() {
		System.out.println("inside no arg ");
       }
	void m1(int a) {
		System.out.println("inside int");
	}
	void m1(int a,int b) {
		System.out.println("inside int , int");
	}
	void m1(int a, float b) {
		System.out.println("inside int,float");
	}
	void m1(float b) {
		System.out.println("inside float");
	}
	void m1(double a) {
		System.out.println("inside double");
	}
	void m1(Number a) {
		System.out.println("inside number");
		
	}
	void m1(Integer c) {
		System.out.println("inside integer");
	}
	void m1(Object g) {
		System.out.println("inside object");
		
	}
}