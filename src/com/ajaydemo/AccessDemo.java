package com.ajaydemo;

public class AccessDemo {
}
class Company{
	int cpnId;
	String cpnNm;
	static int noOfEmployee;
	
	static void m1() {
		int a;
		Company cpn1=new Company();
		System.out.println("inside static method"+cpn1.cpnId);
		System.out.println("static fields"+noOfEmployee);
		cpn1.m2();
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
	
	

}
   class Department{
	   void m2() {
		   Company cpn2=new Company();
		   System.out.println("instance"+cpn2.cpnId);
		   System.out.println("static fields"+Company.noOfEmployee);
	   }
	   static void m3() {
		   Company cpn3=new Company();
		   System.out.println("instance"+cpn3.cpnId);
		   System.out.println("static field"+Company.noOfEmployee);
		   
	   }
	   public static void main(String[] args) {
			System.out.println("Inside main method");
			Company cpn1=new Company();
			Company cpn2=new Company();
			Company cpn3=new Company();

		}
   }




