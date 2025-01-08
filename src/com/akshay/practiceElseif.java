package com.akshay;

import java.util.Scanner;

public class practiceElseif {
	public static void main(String[] args) {
		ElseifDemo();
	}
	
	static void ElseifDemo() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Number");
		
		int num=sc.nextInt();
		
		 System.out.println("1- is Positive number");
		 System.out.println("2 -is Even number or Odd number");
		 System.out.println("3 -is Prime number");
		    
		
		System.out.println("Enter your Choice Number");
	    int choice=sc.nextInt();
	    
	    if(choice==1) {
	  	
	    if(num > 0 ) 
	    	System.out.println("Number is positive");
	    else 
	    	System.out.println("Number is Negative");
	    }
	    else if(choice==2) {
	    	if(num % 2==0)
	    		System.out.println("Number is Even");
	    	else
	    		System.out.println("Number is Odd");
	    }
	    if (choice==3) {
	     if(num ==1 || num==2 || num==3 || num==5 || num==7) 
	    	System.out.println("Number is prime");
	     else if(num %2 >0 && num % 3 >0 && num % 5>0 && num % 7>0)
	    	 System.out.println("Number is prime");
	     else
	    	 System.out.println("Not is not prime ");
	    
	    }
	    else
	    	System.out.println("Invalid choice");
	        System.out.println("End the pgm");
	}

}
