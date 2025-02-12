package com.sushantdemo;

import java.util.Scanner;

public class GuessNumberMiniProject {
	public static void main(String[] args) {
		m1();
	}
	
	static void m1() {
		
		int myNumber= (int)(Math.random()*100);
		Scanner sc=new Scanner(System.in);
		
		
		int a=0;
		do {
			System.out.println("Guess My Number 1- 100 : ");
			 a=sc.nextInt();
			 
			if(myNumber==a) {
				System.out.println("WOOOHOOOOO YOU ARE CORRECT");
			break;
			}
			 else if(myNumber > a) {
			System.out.println("Your Number is Too Small ");
		}
			 else {
		System.out.println("Your Number is Too Large");
		
	}
	
	}while (a >= 0);
		System.out.println("OOhhh Ho My Number is : " + myNumber);

	}
}