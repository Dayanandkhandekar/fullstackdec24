package com.sakshiDemo;

import java.util.Scanner;

public class LeapYear {
	
	static void b1() {
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter year=");
		int d=s.nextInt();
		
		if (d % 4 == 0) {
			System.out.println("This is leap year");
		
		
		
	}
	 System.out.println("This is no-leap year");
	
		
	}
	public static void main(String[] args) {
		b1();
	}

}
