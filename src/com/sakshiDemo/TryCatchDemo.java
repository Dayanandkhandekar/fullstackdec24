package com.sakshiDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryCatchDemo {
	public static void main(String[] args)  {
		m1();
	}
	static void m1() {
		System.out.println("inside m1");
		m2();
		System.out.println("end m1");
		
	}
	static void m2() {
		System.out.println("inside m2");
		m3();
		System.out.println("end m2");
	}
	static void m3() {
		System.out.println("inside m3");
		File f1=new File("D:\\ABC.text");
		 try {
			FileInputStream f2=new FileInputStream(f1);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 finally {
			 
		 }
		 System.out.println("End  m3");

		
	}
}
