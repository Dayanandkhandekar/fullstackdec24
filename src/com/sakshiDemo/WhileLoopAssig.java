package com.sakshiDemo;

public class WhileLoopAssig {
	 static void m1() {
		int a=50;
		int sum=0;
		while(a>=1) {
			
			a-=2;
			System.out.println("even no=="+a);
			
			sum+=a;
			
		}
		System.out.println("addition of even no=="+sum);
	}
	 
	 public static void main(String[] args) {
		m1();
	}
	}

