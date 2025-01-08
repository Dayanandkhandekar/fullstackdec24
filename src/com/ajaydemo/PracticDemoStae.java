package com.ajaydemo;

import java.util.Scanner;

public class PracticDemoStae {
	static void a1() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number:");
		int a=sc.nextInt();
		
		System.out.println("1 Check the number divided by 3 and 5 not");
		System.out.println("2 square check the number devided by 3 and 5 not ");
		System.out.println("3 cube check the devide by 3 and 5 not");
		
		System.out.println("Enter your choice");
		int choice=sc.nextInt();
		switch(choice)
		{
		
		case 1:if(a%3==0 && a%5==0) {
			System.out.println("Your num is devigible by 3 and 5");
			
		}
		else {
			System.out.println("Ur num is not devigible by 3 and 5");
		}
		break;
	
		
		case 2:
		int num=a*a;
		
		System.out.println("The square of your number:"+num);
		
		if(num%3==0 && num%5==0) {
			System.out.println("Squre of your num is divigible by 3 and 5");
			
			}else
			{
				System.out.println("Squre of your num is not devigible by 3 and 5");
			}
		break;
		
		case 3:
			int Num=a*a*a;
			System.out.println("The cube of your number "+Num);
			if(Num%3==0 && Num%5==0) {
				System.out.println("The cube of your num is divigible by 3 and 5");
				
			}else {
				System.out.println("The cube of Ur num is not  divigible by  3 and 5");
			}
			break;
			default:
				System.out.println("Invalid Value");
		}
		
			
		}
	

	public static void main(String[] args) {
		a1();

	}

}
		
