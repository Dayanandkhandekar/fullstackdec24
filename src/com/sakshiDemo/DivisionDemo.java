package com.sakshiDemo;

import java.util.Scanner;

public class DivisionDemo {
	
	static void a1() {
		Scanner s=new Scanner(System.in);
		System.out.println("enter first no=");
		int a=s.nextInt();
		System.out.println("enter second no=");
		int b=s.nextInt();
		
	   double D=a2(a,b);
		System.out.println("division result="+D);
		
		if(D/ 2==0)  {
			System.out.println("your result is even no");
			
		}
		System.out.println("your result is odd no");
		
	}
	
	static double a2(int a,int b) {
		double d=a/b;
		return d;
		
	}
	public static void main(String[] args) {
		a1();
	}

}
