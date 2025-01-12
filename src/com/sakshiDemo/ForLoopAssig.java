package com.sakshiDemo;

public class ForLoopAssig {
	
	
	static void m1() {
		int sum=0;
		for(int a=1; a<=50;a++) {
			
			if(a%2==0) {
				System.out.println("even numbers="+a);
				
				sum+=a;
				 
				
			}
			
			
			
			
			
		}
		System.out.println("addition of even no="+sum);
		
		
	}
	


public static void main(String[] args) {
	m1();
	
}
}
