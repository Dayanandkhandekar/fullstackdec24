package com.akshay;

public class forloopDemo{
	public static void main(String[] args) {
		//fordemo();
		//ForReversorder();
		//whileDemo();
		whileReversOder();
	}
	
	static void fordemo() {
		for (int i=1; i<=50; i++) {
			System.out.println("i=="+i);
		    }
		}
		static void ForReversorder() {
			for (int i=50; i>=1; i--) {
				System.out.println("i=="+i);
	}
	}
	static void whileDemo() {
		int i=1;
		while(i<=50) {
			System.out.println("i=="+i);
			i++;
		}
	}
	static void whileReversOder() {
		int i=50;
		while(i>=1) {
			System.out.println("i=="+i);
			i--;
		}
	}
}

	