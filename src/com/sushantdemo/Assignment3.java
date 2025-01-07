package com.sushantdemo;

import java.util.Scanner;

public class Assignment3 {
	
	static void m1() {
	Scanner a1=new Scanner(System.in);
	System.out.println("Enter Your Number");
	int a=a1.nextInt();
	 if(a > 0) {
		 System.out.println("Your Number Is Positive");
		 
	 }else {
		 System.out.println("Your Number Is Negative");
	 }
	 if(a%2==0) {
		 System.out.println("Your Number Is Even");
		 
	 }else {
		 System.out.println("Your Number Is Odd");
	 
	 }
	
	 }
public static void main(String[] args) {
	m1();
}
}
	

