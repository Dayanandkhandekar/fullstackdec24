package com.akshay;

import java.util.Scanner;

public class MorningAssignment {
	public static void main(String[] args) {
		m1();
	}

	static void m1() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your first number");
		int num1=sc.nextInt();
		System.out.println("Enter your second number");
		int num2=sc.nextInt();
		boolean flag=false;
		
		do {
		System.out.println("Main Menuu");
		
		System.out.println("1-Addition");
		System.out.println("2-Substraction");
		System.out.println("3-Multiplication");
		System.out.println("4-Divsion");
		
		System.out.println("Enter your Choice");
		int ch=sc.nextInt();
		
		switch (ch) {
		case 1:int a= num1+num2;
             System.out.println("Addition=="+a);
             break;
               
      
		case 2:int b=num1-num2;
		System.out.println("Substraction=="+b);
		break;
		
		case 3:int c=num1*num2;
		System.out.println("Multiplication=="+c);
		break;
		
		case 4: int d=num1/num2;
		System.out.println("Division=="+d);
		break;
		}
		
		System.out.println("Do you want to Continue");
		String s=sc.next();
		 if(s.equalsIgnoreCase("y")) {
			 flag=true;
		 }
		 else {
			 flag=false; 
		 }

	}while(flag);
		
			System.out.println("Invalid your Choice Enter Other number");
			  
		}
}
