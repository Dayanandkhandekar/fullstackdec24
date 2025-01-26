package com.akshay;

public class AbstracClassPractiesDemo {

}
abstract class Pemp{
	int pId;
	
	public Pemp(int pId) {
		super();
		this.pId = pId;
	}

	abstract void m1();
}
abstract class Temp{
	int tId;
	
	public Temp(int tId) {
		super();
		this.tId = tId;
	}

	abstract void m2();
}
class NewCompany extends Temp {

	public NewCompany(int tId) {
		super(tId);
		// TODO Auto-generated constructor stub
	}

	@Override
	void m2() {
		// TODO Auto-generated method stub
		
	}

	
}



	

