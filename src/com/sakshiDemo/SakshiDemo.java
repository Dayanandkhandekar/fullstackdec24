package com.sakshiDemo;

public class SakshiDemo {

}
class Employee{
	int empId;
	String empName;
	String empDept;
	
	
	static void a1() {
		System.out.println("Inside Static method");
		
	}
	
	void a2() {
		System.out.println("inside instatnce method");
		
	}
	
	
	{
		System.out.println("inside instance block");
	}
	
	static {
		System.out.println("Inside Static block");
		
	}
	
	public static void main(String[]args) {
		System.out.println("inside main");
		Employee c1=new Employee();
		Employee d1=new Employee();
		Employee e1=new Employee();
		
	}
}