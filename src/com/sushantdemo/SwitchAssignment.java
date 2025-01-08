package com.sushantdemo;

import java.util.Scanner;

public class SwitchAssignment {
public static void main(String[] args) {
	m1();
}
static void m1() {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter Your Number");
	int s1=s.nextInt();
	System.out.println("");
	
	System.out.println("Menu");
	System.out.println("1 - is your number is devisible by 3 & 5");
	System.out.println("2 - is your numbers Square is devisible by 3 & 5");
	System.out.println("3 - is your numbers Cube is devisible by 3 & 5");
	System.out.println("");
	
	System.out.println("Enter Your Choice");
	int s2=s.nextInt();
	
	
	switch (s2) {
	case 1: 
		if(s1 % 3 == 0 && s1 % 5 == 0)
         System.out.println("Your number is devisible by 3 & 5");
		else
	         System.out.println("Your number is Not devisible by 3 & 5");
		break;
	case 2:
		int p=s1*s1;
		System.out.println("Square of Your Number=="+p);
		if(p % 3 == 0 && p % 5 == 0)
			System.out.println("Your numbers Square is devisible by 3 & 5");
		else
			System.out.println("Your numbers Square is Not devisible by 3 & 5");
		break;
	case 3: 
		int p1=s1*s1*s1;
		System.out.println("Cube of Your Number=="+p1);
		if(p1 % 3 == 0 && p1 % 5 == 0)
			System.out.println("Your numbers Cube is devisible by 3 & 5");
		else
			System.out.println("Your numbers Cube is Not devisible by 3 & 5");
		break;
	
	
	default:
		System.out.println("Invalid Selection Please Try Again");
		
	}
	System.out.println("");
	System.out.println("**End Of Program**");
	
}
}


