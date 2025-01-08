package com.sakshiDemo;

import java.util.Scanner;

public class AssignmentNo5 {
	
	
	static void a1(){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your No=");
		int a=s.nextInt();
		//int choice;
		System.out.println("1 check no is Division by 3 and 5 or not");
		System.out.println("2 square and check it Division by 3 and 5 or not");
		System.out.println("3 cube and check it Division by 3 and 5 or not");
		System.out.println("Enter your choice");
		
		int choice=s.nextInt();
		
		switch(choice){
		
		
		case 1:if(a%3==0 || a%5==0) {
			System.out.println("Num is division by 3 and 5");
					
			}
		else {
			System.out.println("Num not division by 3 and 5");
		}
		break;
		
		
		
		case 2:
	     int b=a*a;
	     System.out.println("square of a is="+b);
	     
		if(b%3==0 || b%5==0) {
			System.out.println("Num is division by 3 or 5");
					
			}
		else {
			System.out.println("Num not division by 3 and 5");
		}
		break;
		
		
		
		case 3:
			int c=a*a*a;
			System.out.println("cube  of no a is="+c);	
			
			
			if(c%3==0 || c%5==0) {
				System.out.println("Num is division by 3 or 5");
						
				}
			else {
				System.out.println("Num not division by 3 and 5");
			}
		break;
		
		
		default:
			System.out.println("Invalid choice");
		
		}
		
		}
		public static void main(String[] args) {
			a1();
		}
}
