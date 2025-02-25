package com.sakshiDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Throws {
	public static void main(String[] args) throws FileNotFoundException {
		m1();
	}
	static void m1() throws FileNotFoundException {
		System.out.println("inside m1");
		m2();
		System.out.println("end m1");
		
	}
	static void m2() throws FileNotFoundException {
		System.out.println("inside m2");
		m3();
		System.out.println("end m2");
	}
	static void m3() throws FileNotFoundException {
		System.out.println("inside m3");
		File f1=new File("D:\\ABC.text");
		 FileInputStream f2=new FileInputStream(f1);
		 System.out.println("End of m3");

		
	}
}
