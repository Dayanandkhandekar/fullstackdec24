package com.sakshiDemo;

public class MethodOverridingDemo {
	public static void main(String[] args) {
		//MethodOverriding p1=new MethodOverriding();//complie time polymorphism
		//p1.m1();
		MethodOverriding p=new MethodOverriding1();  //run time polymorphism
		p.m1();
		MethodOverriding m=new MethodOverriding4();
		m.m2();
	}

}
class MethodOverriding{
	void m1() {
		System.err.println("inside m1 MethodOverriding");
	}
	void m2(){
		System.out.println("inside m2 MethodOverriding");
	}
}
class MethodOverriding1 extends MethodOverriding{
	void m1() {
		System.out.println("inside m1 MethodOverriding1 ");
	}
	void m3() {
		System.out.println("inside m3 MethodOverriding1");
	}
}

class MethodOverriding4 extends MethodOverriding1{
	void m4() {
		System.out.println("inside m4 MethodOverriding4");
	
	}
}
