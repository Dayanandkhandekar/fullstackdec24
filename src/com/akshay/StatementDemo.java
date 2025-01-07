package com.akshay;

import java.util.Scanner;

public class StatementDemo {
	static void ifDemo() {
		Scanner s1= new Scanner(System.in);
		
		System.out.println("Enter your age");
		int age =s1.nextInt();
		if(age > 18) {
			System.out.println(" Your are eligible for voting");	
			
		    System.out.println("Your are not eligible for voting");
			
		    System.out.println("End of program");
	}
	}
	
	public static void main(String[] args) {
		ifDemo();
	}

}
