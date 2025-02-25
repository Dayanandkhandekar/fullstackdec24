package com.sakshiDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandling{
	public static void main(String[] args) {
		m1();
	}
static void m1() {
	 File f1 = new File("D:\\ABC.text");
	try {
		FileInputStream f2=new FileInputStream(f1);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
 }
 static void m2() {
	 int a= 10/0;
 }
}



