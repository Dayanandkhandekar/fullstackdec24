package com.sushantdemo;

import java.util.Scanner;

public class Multiplication {
	
	static void m1() {
	
	Scanner a=new Scanner(System.in);
	System.out.println("Enter Your First No");
	int a1=a.nextInt();
	System.out.println("Enter Your Second No");
	int a2=a.nextInt();
	
	int result=m2(a1, a2);
	
	System.out.println("Multiplication Result="+result);
	
	if(result <= 0) {
		System.out.println("Your Result Is Negative");
	}
	if(result >0) {
		System.out.println("Your Result Is Positive");
	}
	System.out.println("End Of Program");

}
	static int m2 (int a, int b) {
	int result=a*b;
	return result;
	}
	public static void main(String[] args) {
		m1();
	}
}
