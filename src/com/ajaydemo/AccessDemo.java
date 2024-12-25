package com.ajaydemo;

public class AccessDemo {
}
class Company{
	int cpnId;
	String cpnNm;
	static int noOfEmployee;
	
	static void m1() {
		int a;
		Company cpn=new Company();
		System.out.println("inside static method"+cpn.cpnId);
		System.out.println("static fields"+noOfEmployee);
		cpn.m2();
		m3();
	}
	
	static void m3 () {
		
	}
	void m2() {
		int a=10;
		System.out.println("inside instance method"+cpnId);
		System.out.println("inside instance method"+noOfEmployee);
		System.out.println("local variable"+a);
	}
	
	{
		int a;
		System.out.println("inside instance block");
	}
	static {
		int b;
		System.out.println("inside static block");
	}
	
	public static void main(String[] args) {
		System.out.println("Inside main method");

	}

}
   class Department{
	   void m2() {
		   Company cpn=new Company();
		   System.out.println("instance"+cpn.cpnId);
		   System.out.println("static fields"+Company.noOfEmployee);
	   }
	   static void m3() {
		   Company cpn=new Company();
		   System.out.println("instance"+cpn.cpnId);
		   System.out.println("static field"+cpn.noOfEmployee);
	   }
   }




