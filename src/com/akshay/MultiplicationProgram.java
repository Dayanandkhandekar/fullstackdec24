package com.akshay;

import java.util.Scanner;

public class MultiplicationProgram {
	
	static int num;
	static void m1() {
		Scanner s1= new Scanner(System.in);
		
		System.out.println("enter your first no");
		int fn=s1.nextInt();
		System.out.println("Enter your second no");
		int sn=s1.nextInt();
		
		int re=m2(fn,sn);
		System.out.println("Multiplication=="+re);
		
		if(num<0)
			System.out.println("Number is Positive");
		
		
	}
	static int m2(int a,int b) {
		int re= a*b;
		return re;
		
		

	}
	public static void main(String[] args) {
		m1();
	}

}
