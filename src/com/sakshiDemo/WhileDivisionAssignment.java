package com.sakshiDemo;

public class WhileDivisionAssignment {
static void m1() {
	int a=50;
	int sum=0;
	while(a>1) {
		
		a--;
		

		if(a%3==0 && a%5==0) {
			System.out.println("Number division by 3 and 5="+a);
			
			
			sum+=a;
			System.out.println("addition="+sum);
			
		}
		
		

		
	}
	
}
public static void main(String[] args) {
	m1();
	
}
}
