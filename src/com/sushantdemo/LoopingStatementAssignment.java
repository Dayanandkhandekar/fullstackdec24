package com.sushantdemo;

public class LoopingStatementAssignment {  
	
// Using For Loop Forward Condition=====>>>>>>
	
	static void m1() {
		 System.out.println("1 to 50 All Even Numbers *For Loop Forward Case*");
		 System.out.println("");
		 int total=0;
		 for(int a=1;a<=50; a++) {
			 if (a % 2 == 0) {
			 System.out.println(a);
			 total+=a;}
		 }
		 System.out.println("Total of all Even No = "+total );
		 System.out.println("");
	
		 System.out.println("1 to 50 All Even Numbers Divisible by 3 & 5");
		 System.out.println("");
		 int div=0;
		 for(int a=1;a<=50; a++) {
			 if (a % 3 == 0 && a % 5 == 0) {
			 System.out.println(a);
			 div+=a;}
			  }
		 System.out.println("Total of all Even No divisible by 3 & 5 = "+div); 
		 
		 
		 System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
		 }
	
	
// Using For Loop Reverse Condition=====>>>>>>
	
	
	static void m2() {
		System.out.println("50 to 1 All Even Numbers *For Loop Reverse Case*");
		System.out.println("");
		int total=0;
		for(int r=50; r>1; r--) {
		if (r % 2 == 0){
			System.out.println(r);
			
			total=total+r;
		}
		}
		System.out.println("Total of all Even Numbers = "+total);
		System.out.println("");
		System.out.println("50 to 1 All Even Numbers Divisible by 3 & 5");
		System.out.println("");
	
		int div=0;
		for (int m=50; m>1; m--) {
			if(m % 3 == 0 && m % 5 == 0) {
				System.out.println(m);
				div=div+m;	
			}
		}
		System.out.println("Total of all Even No divisible by 3 & 5 = "+div);
		
		
		System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
		}
		
		
			
// Using While Loop Forward Condition=====>>>>>>
	
	static void m3() {
	
		System.out.println("1 to 50 All Even Numbers *While Loop Forward Case*");
		System.out.println("");
		int  total=0;
			int a=1;
			  while(a<=50) {
				  if(a % 2 == 0) {
				  System.out.println(a);
				  total=total+a; }
				  a++;
				   }
			  System.out.println("Total of all Even No = "+total);
			  System.out.println("");
			  
			  System.out.println("1 to 50 All Even Numbers Divisible by 3 & 5");
			  System.out.println("");
				 int div=0;
				 int b=1;
						 while(b<=50) {
							  if(b % 3 == 0 && b % 5 == 0) {
							  System.out.println(b);
							  div=div+b; }
							  b++;
							   }
				 System.out.println("Total of all Even No divisible by 3 & 5 = "+div); 
				 
	System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");

				 
	}
// Using While Loop Reverse Condition=====>>>>>>
		static void m4() {
			System.out.println("50 to 1 All Even Numbers *While Loop Reverse Case*");
			System.out.println("");
			int  total=0;
				int d=50;
				  while(d>=1) {
					  if(d % 2 == 0) {
					  System.out.println(d+" ");
					  total=total+d; }
					  d--;
					   }
				  System.out.println("Total of all Even No = "+total);
				  System.out.println("");
				  System.out.println("50 to 1 All Even Numbers Divisible by 3 & 5");
				  System.out.println("");
					 int div=0;
					 int e=50;
							 while(e>=1) {
								  if(e % 3 == 0 && e % 5 == 0) {
								  System.out.println(e);
								  div=div+e; }
								  e--;
								   }
					 System.out.println("Total of all Even No divisible by 3 & 5 = "+div); 
					 
					 System.out.println("");
					 
					System.out.println("**End Of Program**");
		}
		
		
				
	
	
	public static void main(String[] args) {
        m1(); // Using for loop Forward case
		m2(); // Using for loop Reverse case
		m3(); //Using While loop Forward case
		m4(); //Using While loop Forward case
	}
	
}
