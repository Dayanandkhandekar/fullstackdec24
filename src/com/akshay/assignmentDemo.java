package com.akshay;

import java.util.Scanner;

public class assignmentDemo {
	static void m1() {
	 Scanner sc = new Scanner(System.in);
     
     System.out.print("Enter a number to check divisibility by 3 and 5: ");
     int num1 = sc.nextInt();
    
     
     // Checking the square of a number for divisibility by 3 and 5
     System.out.print("Enter a number to square and check divisibility by 3 and 5: ");
     int num2 = sc.nextInt();
     int square = num2 * num2;
     System.out.println("Square of " + num2 + " is " + square);
     
     
     // Checking the cube of a number for divisibility by 3 and 5
     System.out.print("Enter a number to cube and check divisibility by 3 and 5: ");
     int num3 = sc.nextInt();
     int cube = num3 * num3 * num3;
     System.out.println("Cube of " + num3 + " is " + cube);
	}

 // Method to check divisibility by 3 and 5
     static void checkDivisibility(int number) {
     if (number % 3 == 0 && number % 5 == 0) {
         System.out.println(number + " is divisible by both 3 and 5.");
     } else {
         System.out.println(number + " is not divisible by both 3 and 5.");
     }
 }
 public static void main(String[] args) {
	 m1();
	
}
}

