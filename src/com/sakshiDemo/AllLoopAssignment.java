package com.sakshiDemo;

import java.util.Scanner;

public class AllLoopAssignment {
	static void m1() {
		
		int choice;
		Scanner s=new Scanner(System.in);
		System.out.println("enter your number=");
		int a=s.nextInt();
		
		boolean flag=false;
		do{
			
			System.out.println("choice 1 for check number is even or odd ");
			System.out.println("choce 2 for check number is prime or not");
			System.out.println("choice 3 for factorial ");
			System.out.println("choice 4 for fibonnaci");
			System.out.println("choice 5 for check number positive or negative");
			System.out.println("Enter your choice=");
			
			choice=s.nextInt();
			
			switch(choice) {
			
			case 1:
				if(a%2==0) 
				System.out.println("your number is even");
			    else
				System.out.println("your number is odd");
				break;
				
				
				
			case 2:
				if(a==1 ||a==2|| a==3 ||  a== 5|| a==7) {
				System.out.println("No is prime");
			}else if (a%1>0  || a%2>0|| a%3>0 ||  a%5>0|| a%7>0) {
				System.out.println("No is prime");
			}
			else {
				System.out.println("No is not prime");
			}	
		   break;
		   
			case 3:
				if(a>0) {
					int factorial=1;
					for( int i=1; i<=a; i++) {
						   factorial *=i;
						System.out.println("factorial of number"+factorial);
				}
					
				}
				break;
				
				
			case 4:
				
				int n = a,  fT = 0, sT = 1;
			    
			    while (fT <= n) {
			      

			      int nT = fT + sT;
			      fT = sT;
			      sT = nT;
			      
			      System.out.print(fT+ " ");
			        
			    }
			      
			    
			
				break;
				
			case 5 :if(a>0) {
				System.out.println("Your no is positive ");
			   }
				else {
					System.out.println("Your no is negative");
					
				}
			  break;
			
				
			
			
			}
			
	   
			
	     System.out.println("Do you want to continue ");
			
		 String b=s.next();
		 if(b.equalsIgnoreCase("y")) {
			 flag=true;
		 }
		 else {
			 flag=false; 
		 }
	
	}while(flag);
		System.out.println("End of program");
		
		
		}
		

	public static void main(String[] args) {
		m1();
		
}
}


