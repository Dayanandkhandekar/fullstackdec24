package com.akshay;

import java.util.Scanner;

public class conditionStatement {
	
	static void elseDemo () {
		Scanner s1= new Scanner(System.in);
		System.out.println("Enter your age");
		
		int age =s1.nextInt();
		
		if (age>21) {
			System.out.println("Your are eligible for votting");
		}
		
	     else {
				System.out.println("Your are not eligible for votting");
			}
	}
	
	public static void main(String[] args) {
	elseDemo();
	
	}

}
