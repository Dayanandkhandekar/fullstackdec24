package com.akshay;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryCatchDemo {
	public static void main(String[] args) {
		m1();
		
	}
	static void m1() { 
		 System.out.println("Inside m1");
		 m2();
		 System.out.println("End of m1");
	 }
	 static void m2()  {
		 System.out.println("Inside m2");
	       m3();
	       System.out.println("End of m2");
	 }
	 static void m3()  {
		 System.out.println("Inside m3");
		 File f1=new File("abc.text");
		 try {
			FileInputStream f2=new FileInputStream(f1);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
		 finally {
			 System.out.println("Finally block always executed");
		 }
		 System.out.println("End of m3");
	 }
}
