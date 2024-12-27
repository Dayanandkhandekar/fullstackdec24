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
		System.out.println("e==="+d1);
   	 String s1=new String("ABcxtn");
   	
   	 
   	 String s2=new String("ABcxtn");
   	 String s3="abc";
   	 
   	 String s5="abc";
   	
   	 
   
   	 
   	  System.out.println(s1==s2);
   	  System.out.println(s3==s5);

   	  
		

		
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empDept=" + empDept + "]";
	}
	
}
	
	class Bank{
		
		
		 
		 void m2() {
			 Employee e=new Employee();
			 System.out.println("instance field"+e.empId);
			 System.out.println("static field"+Employee.noOfEmployee);
		 
		 
		 }
		 
		 static void m3(){
			 Employee e=new Employee();
			 System.out.println("instance field"+e.empName);
			 System.out.println("static field "+Employee.empProject);
			 
			 
			  
			 
		 }
	 }
			
			
			
	
	


