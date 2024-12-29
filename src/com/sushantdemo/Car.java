package com.sushantdemo;

public class Car {
	static String carName;
	int carId;
	static int carNo;
	String carBrandName;

	static void n1() {
		Car c1=new Car();
		System.out.println("inside static method"+ c1.carBrandName);
		
		System.out.println("inside static fields"+carNo);
		
		}
	void n2() {
		
		System.out.println("inside instance method");
	}
	{
		System.out.println("inside instance block");
		}
	
	static {
		Car c=new Car();
		System.out.println("inside static block");
		System.out.println("inside static block"+ carName);
		System.out.println("inside static block"+ c.carBrandName);
	}
	}

	class Car2 {
		String carBrandName;
		int carNo;
		static int carSpeed;
		static void n1() {
			Car2 c2=new Car2();
			System.out.println("inside static method"+ Car2.carSpeed);
			System.out.println("inside static method"+ c2.carBrandName);
			System.out.println("inside static fields"+Car.carNo);
			
			Car c1=new Car();
			System.out.println("inside static method"+ Car.carName);
			System.out.println("inside static method"+ c1.carBrandName);
			}
		{
			System.out.println("inside instance block");
		}
		
	static {
		System.out.println("inside static block"+carSpeed);
	}
	public static void main(String[] args) {
		System.out.println("inside main");
	Car c2=new Car();
	Car c1=new Car();
	Car c=new Car();
	Car2 i3=new Car2();
	
	System.out.println("I====="+i3);
	
    String c3=new String("am====");
    
    String i1=new String("am====");
    
    String c4="Student";
    String i2="Student";
    
    System.out.println(c3==i1);
    System.out.println(c4==i2);
    
    

	}
	
	@Override
	public String toString() {
		return "Car2 [carBrandName=" + carBrandName + ", carNo=" + carNo + "]";
	}
}
