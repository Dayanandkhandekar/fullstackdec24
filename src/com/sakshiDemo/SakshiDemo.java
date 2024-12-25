package com.sakshiDemo;



public class SakshiDemo {

}


class Employee{
	int empId;
	String empName;
	String empDept;
	static  int noOfEmployee;
	static String empProject;
	
	
	
	static void a1() {
		Employee e=new Employee();
		System.out.println("Inside Static method"+e.empId);
		System.out.println(" static field"+noOfEmployee);
	}
	
	void a2() {
		System.out.println("inside instatnce method"+empId);
		System.out.println("static fields"+noOfEmployee);
		

		
	}
	
	
	
	{
		System.out.println("inside instance block");
		System.out.println("instance field"+empDept);
	}
	
	static {
		Employee b=new Employee();
		System.out.println("Inside Static block");
		System.out.println("instatnce field"+b.empName);
		
	}
	
	public static void main(String[]args) {
		System.out.println("inside main");
		Employee c1=new Employee();
		Employee d1=new Employee();
		Employee e1=new Employee();

		
	}
	
	
	class Bank{
		
		
		 
		 void m2() {
			 Employee e=new Employee();
			 System.out.println("instance field"+e.empId);
			 System.out.println("static field"+Employee.noOfEmployee);
		 
		 
		 }
		 
		 {
			 Employee e=new Employee();
			 System.out.println("instance field"+e.empName);
			 System.out.println("static field "+Employee.empProject);
			 
			 
			  
			 
		 }
	 }
			
			
			
	
	
}

