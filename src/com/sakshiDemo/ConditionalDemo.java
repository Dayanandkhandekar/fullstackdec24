package com.sakshiDemo;

import java.util.Scanner;

public class ConditionalDemo {
	static void b() {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the first no==");
		int a=s.nextInt();
		System.out.println("enter your second no=");
		int b=s.nextInt();
		System.out.println("enter third no=");
		int c=s.nextInt();
		
		if(a>b && a>c ) {
			System.out.println("a is the greter no="+a);
			
		}
		else if(b>a && b>c ){
			System.out.println("b is the greter no="+b);
		}
		else if (c>a && c>b) {
			System.out.println("c is the greter no="+c);
			
		}
		else {
			System.out.println("all no are even");
		}
		
	}
	public static void main(String[] args) {
		b();
	}
	
}


