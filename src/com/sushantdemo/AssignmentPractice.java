package com.sushantdemo;

import java.util.Scanner;

public class AssignmentPractice {
 public static void main(String[] args) {
	m1();
}
 
 static void m1() {
	 Scanner input=new Scanner(System.in);
	 System.out.println("Enter your Value");
	 int in=input.nextInt();
	 
	 System.out.println("Menu");
	 System.out.println("1-Check number is Positive or Negative");
	 System.out.println("2-Check number is Even or Odd");
	 System.out.println("3-Check number is Prime or NotPrime");
	 System.out.println("4-Check number is Divisible by 10");
	 
	 System.out.println("Chose your Menu");
	 int choice=input.nextInt();
	 if(choice == 1)
		 if(in > 0)
			 System.out.println("Your Number is Positive");
		 else
			 System.out.println("Your Number is Negative");
	 else if(choice == 2)
		 if(in % 2 == 0)
			 System.out.println("Your Number is Even");
		 else 
			 System.out.println("Your Number is Odd");
	 else if (choice == 3) {
		 if(in == 1 || in == 2 || in == 3 ||in == 5 ||in == 7)
		 System.out.println("Your Number is Prime");
		 else if(in % 2 > 0 && in % 3 > 0 && in % 5 > 0 && in % 7 > 0)
		 System.out.println("Your Number is Prime");
	 else  
		 System.out.println("Your Number is NotPrime");
	 }
	 else if(choice == 4)
		 if(in % 10 == 0)
			 System.out.println("Your Number is Divisible By 10");
		 else
			 System.out.println("Your Number is not Divisible By 10");
		 else
			 System.out.println("Enter Valid Menu");
 
System.out.println("End Of Program");
 }
}

