package com.sushantdemo;

import java.util.Scanner;

public class LoopingStatementAssignment2 {
	static void m1() {
		
		System.out.println("Enter Your Number");
		Scanner e=new Scanner(System.in);
		int i=e.nextInt();
		boolean flag=false;
		
		do {
		System.out.println("Options : ");
		System.out.println("1 - Even or Odd");
		System.out.println("2 - Prime or Not-Prime");
		System.out.println("3 - Positive or Negative");
		System.out.println("4 - Factorial of Number");
		System.out.println("5 - Fibonacci of Number");
	
		
		System.out.println("");
		System.out.println("Enter Your Option");
		int o=e.nextInt();
		
		
		switch (o) {
	
			case 1: {
			if(i % 2 == 0)
				System.out.println(i+" - is Even Number");
			else 
				System.out.println(i+" - is Odd Number");
		}
		break;
		case 2: {
				if(i==1 || i==3 || i==5 || i==7)
					System.out.println(i+" - is Prime Number");
				else if(i % 2 > 0 && i % 3 > 0 && i % 5 > 0 && i % 7 >0)
					System.out.println(i+" - is Prime Number");
				else
					System.out.println(i+" - is Not-Prime Number");
			}
		break;
		case 3: {
			if(i<0)
				System.out.println(i+" - is Negative Number");
			else
				System.out.println(i+" - is Positive Number");
		}
		break;
		case 4:{
			int facto=1;
			for(int r=1; r<=i; r++) {
				
				facto=facto*r;
		}
			System.out.println("Factorial of Number = "+ facto);
		}
		break;
		case 5: {
            int n = i, firstTerm = 0, secondTerm = 1;
		    
		    while (firstTerm <= n) {
		      System.out.print(firstTerm + " ");

		      int nextTerm = firstTerm + secondTerm;
		      firstTerm = secondTerm;
		      secondTerm = nextTerm;	
			}
		    System.out.println("Fibonacci Series of Number - "+i);
			}
		continue;
		}
		
	System.out.println("Do You Want Continue");
	
	String b=e.next();
	 if(b.equalsIgnoreCase("y")) {
		 flag=true;
	 }
	 else {
		 flag=false; 
	 }

}while(flag);
	
		System.out.println("**End of Program**");
		  
	}
	
	
	public static void main(String[] args) {
		m1();
	}

}
