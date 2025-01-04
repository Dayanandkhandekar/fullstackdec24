package com.sushantdemo;

import java.util.Scanner;

public class Bank {
	int bankId ;
	String bankName ;
	
	public static void main(String[] args) {
		//m1();
		m2();
	}
	
	
	
	
	@Override
	public String toString() {
		return "Bank [bankId=" + bankId + ", bankName=" + bankName + "]";
	}




	public int getBankId() {
		return bankId;
	}




	public void setBankId(int bankId) {
		this.bankId = bankId;
	}




	public String getBankName() {
		return bankName;
	}




	public void setBankName(String bankName) {
		this.bankName = bankName;
	}




	public Bank(int bankId, String bankName) {
		super();
		this.bankId = bankId;
		this.bankName = bankName;
	}
public Bank() {
	
}



	static void m1() {
		Bank b1=new Bank();
		b1.setBankId(1234);
		b1.setBankName("SBI");	
		
		//System.out.println("Print"+b1);
	
		Bank b2=new Bank(123, "BOI");
		//System.out.println(""+b2);
		
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter Your ID");
		int id=s1.nextInt();
		System.out.println("Enter your Bank Name");
		String bankName=s1.next();
		
		Bank b3=new Bank(id, bankName);
		System.out.println(""+b3);
	}
 static void m2() {
	 Scanner s2=new Scanner(System.in);
	 System.out.println("Enter Your First no");
	 int fn=s2.nextInt();
	 System.out.println("Enter Your Second no");
	 int sn=s2.nextInt();
	 //int re=fn+sn;
			 //System.out.println("Addition="+re);
	int re=m3(fn, sn);
	System.out.println("Result="+re);
	
 }
 static int m3(int a, int b) {
     int re=a+b;
     return re;
 }

}
