package com.sakshiDemo;

public class AbstactDemo {
	

}

abstract class SprortBike2{
	
	abstract void m2();
	
	
	
abstract class car2{
	
	int a;
	String vName;
	
	
	public car2(int a, String vName) {
		super();
		this.a = a;
		this.vName = vName;
	}

	abstract void m1(int a);
	
	void m2() {
		
		
		
	}
	
	
}
interface Bike{
	
	
	
}
class Vehicale extends car2 implements Bike{

	public Vehicale(int a, String vName) {
		super(a, vName);
		// TODO Auto-generated constructor stub
	}

	@Override
	void m1(int a) {
		// TODO Auto-generated method stub
		
	}

	
	
	
}
	
}