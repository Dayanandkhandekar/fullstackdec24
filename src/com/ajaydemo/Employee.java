package com.ajaydemo;

public class Employee {
	int empId;             
	String empNm;
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empNm=" + empNm + "]";  // Override the class
	}
	

	public int getempId() {          // add to setter and getter
		return empId;
	}


	public void setempId(int empId) {
		this.empId = empId;
	}


	public String getempNm() {
		return empNm;
	}


	public void setempNm(String empNm) {
		this.empNm = empNm;
	}
	Employee (){
		System.out.println("inside No argumets");      // Default Constructor 
	}
	Employee(int n){
		System.out.println("inside int  para arguments");   // No argument Constructor
	}
	Employee (String n){
		System.out.println("inside String para arguments");   // Parameter constructor
	}

	static void a1() {
		Employee e1=new Employee();
		System.out.println("e1==="+e1);
		e1.setempId(0);
		e1.getempNm();
	
		}

	public static void main(String[] args) {
		a1();
		

	}

}
