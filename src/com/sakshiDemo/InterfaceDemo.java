package com.sakshiDemo;

public class InterfaceDemo {
public static void main(String[] args) {
	
}
}

interface Class{
	void m1(int a, int b);
}

interface Div{
	void m2(int x,int y);
}

class Student4{
	String s_Name;

	@Override
	public String toString() {
		return "Student4 [s_Name=" + s_Name + "]";
	}
	
}

class collage extends Student4 implements Div,Class{

	@Override
	public void m1(int a, int b) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m2(int x, int y) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		return "collage [s_Name=" + s_Name + "]";
	}

	
	
}