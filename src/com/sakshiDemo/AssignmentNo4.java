package com.sakshiDemo;

import java.util.Scanner;

public class AssignmentNo4 {
	static void a1(){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your No=");
		int a=s.nextInt();
		//int choice;
		System.out.println("1 check no is positive or negative");
		System.out.println("2 check no is even or odd");
		System.out.println("3 check no is prime or not");
		System.out.println("Enter your choice");
		int choice=s.nextInt();
		
		
		if(choice==1) {
		
			if(a>0) {
			System.out.println("Your no is positive ");
		}
			else {
				System.out.println("Your no is negative");
				
			}
		}	
		else if(choice==2) {
		        if (a % 2 == 0) {
		            System.out.println("The number is Even.");
		        } else {
		            System.out.println("The number is Odd.");
		        }
		        
		}

				
				
				
		else if(choice== 3){
			if(a==1 ||a==2|| a==3 ||  a== 5|| a==7) {
				System.out.println("No is prime");
			}else if (a%1>0  || a%2>0|| a%3>0 ||  a%5>0|| a%7>0) {
				System.out.println("No is prime");
			}
			else {
				System.out.println("No is not prime");
			}
			
		}
				
		else {
			System.out.println("invalid chioce");
		}
				
				
			
		
		}
		
static void m1() {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter your No=");
	int a=s.nextInt();
	//int choice;
	System.out.println("1 check no is positive or negative");
	System.out.println("2 check no is even or odd");
	System.out.println("3 check no is prime or not");
	System.out.println("Enter your choice");
	int choice=s.nextInt();
	
	switch(choice) {
	case 1:if(a>0) {
			System.out.println("Your no is positive ");
		   }
			else {
				System.out.println("Your no is negative");
				
			}
		
	case 2:if (a % 2 == 0) {
        System.out.println("The number is Even.");
          } 
	    else {
        System.out.println("The number is Odd.");
         }
    
	case 3:if(a==1 ||a==2|| a==3 ||  a== 5|| a==7) {
		System.out.println("No is prime");
	    }else if (a%1>0  || a%2>0|| a%3>0 ||  a%5>0|| a%7>0) {
		System.out.println("No is prime");
		}
	   else {
		System.out.println("No is not prime");
		}
	
	
     //default:
		//	System.out.println("invalid choice");
	}
	
	}
	
	
static void m2() {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter your No=");
	int a=s.nextInt();
	//int choice;
	System.out.println("1 check no is positive or negative");
	System.out.println("2 check no is even or odd");
	System.out.println("3 check no is prime or not");
	System.out.println("Enter your choice");
	int choice=s.nextInt();
	
	switch(choice) {
	case 1:if(a>0) {
			System.out.println("Your no is positive ");
		   }
			else {
				System.out.println("Your no is negative");
				
			}
	break;
		
	case 2:if (a % 2 == 0) {
        System.out.println("The number is Even.");
          } 
	    else {
        System.out.println("The number is Odd.");
         }
    break;
	case 3:if(a==1 ||a==2|| a==3 ||  a== 5|| a==7) {
		System.out.println("No is prime");
	    }else if (a%1>0  || a%2>0|| a%3>0 ||  a%5>0|| a%7>0) {
		System.out.println("No is prime");
		}
	   else {
		System.out.println("No is not prime");
	}
	break;
	
	
     default:
		System.out.println("invalid choice");
	
	}
}
	public static void main(String[] args) {
		//a1();
		//m1();
		m2();
	}


}
