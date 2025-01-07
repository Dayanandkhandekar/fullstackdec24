package com.ajaydemo;

//import java.util.Scanner;

public class Book {
	int bid;
	String bname;
	float bprice;
	

	public int getBid() {
		return bid;
	}


	public void setBid(int bid) {
		this.bid = bid;
	}


	public String getBname() {
		return bname;
	}


	public void setBname(String bname) {
		this.bname = bname;
	}


	public float getBprice() {
		return bprice;
	}


	public void setBprice(float bprice) {
		this.bprice = bprice;
	}
	
	    void a1() {
	    	
	    }
	    public static void main(String[]args) {
	   
		   Book b1=new Book();
		   b1.setBid(111);
		   b1.setBname("ajay");
		   b1.setBprice(64.f);
		   System.out.println("Book Id="+b1.getBid()+" "+"Book Name="+b1.getBname()+" "+"Book Price="+b1.getBprice());
		   
	   
	   }
	    	
		
	}



	
		
	


