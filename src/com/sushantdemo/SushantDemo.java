package com.sushantdemo;

public class SushantDemo {
String abc;
int id=2525;
}
class employeeInfo{
	int employeeId = 12520;
	char ifPresent='P';
	String eName = "XYZ";
	String designation ="General Manager";
	String eAdreess = "109,GVT CHS, Nashik";
	String dis = "Nashik";
	int pinCode = 141414;
	String emailId= "xyz@gmail.com";
	float working = 70.50f;
	String employer ="GVV Transports PVT.LTD";
	boolean present =true;
	String transferDate ="25/10/2025";
	String employeeName() {
		return "xyz";

	}
	void s() {
		System.out.println("Inside instance method");
	}
    static void s1() {
	System.out.println("Inside the static method");
}
    {
    	System.out.println("Inside instance block");
    }
    static {
    	System.out.println("Inside static block");
    }
    public static void main(String[] args) {
		System.out.println("Inside Main");
		employeeInfo E1=new employeeInfo();
		employeeInfo E2=new employeeInfo();
		employeeInfo E3=new employeeInfo();
		employeeInfo E4=new employeeInfo();
		employeeInfo E5=new employeeInfo();
	}
}


