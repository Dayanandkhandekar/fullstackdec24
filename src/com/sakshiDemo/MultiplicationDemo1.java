package com.sakshiDemo;

import java.util.Scanner;

public class MultiplicationDemo1 {

		static void m1() {
			Scanner s=new Scanner(System.in);
			System.out.println("enter first no=");
			int x=s.nextInt();
			System.out.println("enter second no=");
			int y=s.nextInt();
			
			int z=m2(x,y);
			System.out.println("multipication result="+z);
			
			//if(z>0) {
				//System.out.println("Result is positive ");
				
			//}
			
			if(z>0) 
				System.out.println("Result is positive ");
			
			System.out.println("result is negative");
		
		}
		static int m2(int x, int y) {
			int z=x*y;
			return z;
			
			
		}
		
		public static void main(String[] args) {
			m1();
		}
	}


