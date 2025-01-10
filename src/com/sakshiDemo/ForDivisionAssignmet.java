package com.sakshiDemo;

public class ForDivisionAssignmet {
	static void m1() {
		int a, sum=0;
		for(a=1; a<=50;a++) {
			
			if(a%3==0 && a%5==0) {
				System.out.println("Number is division by 3 and 5=="+a);
				
				sum+=a;
				System.out.println("addition =="+sum);
			}
		 	
			
		}
		
	}
	


public static void main(String[] args) {
	m1();
	
}
}