package com.akshay;

public class MethodOVerridingDemo {
	public static void main(String[] args) {
		Parent p=new Parent(); // compile time polymorphism
		//p.m1();
		//Parent p1 =new Child(); //Run time polymorphism
		//p1.m1();
		Parent p1=new Child1();
		p1.m1();
	}

}
class Parent{
	void m1() {
		System.out.println("Inside m1 parent");
	}
	void m2() {
		System.out.println("Inside m2 parent");
		
	}
}
class Child extends Parent{
	//void m1() {
		//System.out.println("Inside m1 child");
	//}
	void m3() {
		System.out.println("Inside m3 child");
		
	}
}
class Child1 extends Child{
	void m1() {
		System.out.println("Inside m1 child1");
		
	}
	void m4() {
		System.out.println("Inside m4 child1");
		
	}
}
