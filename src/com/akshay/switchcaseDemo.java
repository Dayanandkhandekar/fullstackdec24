package com.akshay;

import java.util.Scanner;

public class switchcaseDemo {
	public static void main(String[] args) {
	switchDemo();
	}
	 static void switchDemo() {
		 
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter Ur number");
		 int num=sc.nextInt();
		 
		 System.out.println("Menu");
		 System.out.println(" 1-Postive Or Negative");
		 System.out.println("2-Even or Odd");
		 System.out.println("3-Prime");
		 
		 System.out.println("Enter Ur choice");
		 int choice =sc.nextInt();
		 
		 switch (choice) {
	
		case 1:
			if(num > 0)
				 System.out.println("Postive Num");
			 else
				 System.out.println("Negative");
			break;
			
		 case 2: 
				if(num % 2 == 0)
					 System.out.println("Num is even");
				 else
					  System.out.println("Num is odd");
				break;
				
		
		case 3 : 
			 if(num == 1 || num == 2 || num ==3 || num == 5 || num == 7)
				 System.out.println("Prime number");
			 else if (num % 2 > 0  && num % 3 > 0 && num% 5 > 0 && num% 7 > 0 )
				 System.out.println("Prime Number");
			 else
				 System.out.println("Not Prime");
			 break;
		default:
			 System.out.println("Invalid Choice");
		}
		     System.out.println("End of Pgm"); 
	 }
	 
}


