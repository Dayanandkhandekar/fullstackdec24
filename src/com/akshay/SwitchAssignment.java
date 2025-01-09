package com.akshay;

import java.util.Scanner;

public class SwitchAssignment {
	public static void main(String[] args) {
		m1();
	}
	static void m1() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your Number");
		
		int num=sc.nextInt();
		
		System.out.println("1-your number is divisible by 3 & 5 ");
		System.out.println("2-squre of your number is divisible by 3 & 5 ");
		System.out.println("3- cube of your number is divisible by 3 & 5");
		System.out.println("Enter your choice");
		int choice=sc.nextInt();
		switch (choice) {
		
		case 1: 
			if(num % 3==0 && num% 5==0)
				System.out.println("your number is divisible by 3 & 5 ");
			else
				System.out.println("your number is not divisible by 3 & 5");
			break;
			case 2:
				int sq= num*num;
				System.out.println("Square of your number"+sq);
				if(sq%3==0 && sq%5==0)
					
					System.out.println("square of your number is divisible by 3 & 5");
				else
					System.out.println("square of your number is not divisible by 3 & 5");
				break;
			case 3:
				int cu=num*num*num;
				System.out.println("cube of your number"+cu);
				if(cu%3==0 && cu%5==0)
				
					System.out.println("cube of your number is divisible by 3 & 5");
				else
					System.out.println("cube of your number is not divisible by 3 & 5");
	             break;
		
		default:
			System.out.println("Invalid choice");
			
		}

		
	}

}
