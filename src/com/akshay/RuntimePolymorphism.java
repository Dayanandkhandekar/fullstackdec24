package com.akshay;

public class RuntimePolymorphism {
	public static void main(String[] args) {
		//Vehical v=new Vehical();  // This is compile time polymorphism
		//v.m1();
		//Vehical v1=new Car(); // Run time polymorphism
		//v1.m1();
		Vehical v1=new Car1();
		v1.m1();
	}

}
class Vehical{
	public void m1() {
		System.out.println("Inside m1 Vehical");
		
	}
	 void m2() {
		System.out.println("Inside m2 Vehical");
	}
}
class Car extends Vehical{
	public void m1() {
		System.out.println("Inside m1 Car");
		
	}
	 void m3() {
		System.out.println("Inside m3 Car");
		
	}
}
class Car1 extends Car{
	public void m1() {
		System.out.println("Inside m1 Car1");
		
	}
	 void m4() {
		System.out.println("Inside m4 Car1");
		
	}
}
