package com.ajaydemo;

public class BankOver implements Cloneable  {
	int bnkId;
	String bnkName;
	static int noOfbnk;
	
	
	
	@Override
	public String toString() {
		return "BankOver [bnkId=" + bnkId + ", bnkName=" + bnkName + "]";
	}
	

	public int getBnkId() {
		return bnkId;
	}


	public void setBnkId(int bnkId) {
		this.bnkId = bnkId;
	}


	public String getBnkName() {
		return bnkName;
	}


	public void setBnkName(String bnkName) {
		this.bnkName = bnkName;
	}


	public static int getNoOfbnk() {
		return noOfbnk;
	}


	public static void setNoOfbnk(int noOfbnk) {
		BankOver.noOfbnk = noOfbnk;
	}
	BankOver(){
		System.out.println("");
	}
	BankOver(int n){
		System.out.println(123);
		
	}
	BankOver(String n){
		System.out.println("Ajay Jadhav");
	}


	static void a1() {
		BankOver b1=new BankOver();
		System.out.println("Welcome "+b1);
		b1.setBnkId(101);
		b1.setBnkName("kotak");
		
		System.out.println("Go there"+b1);
		System.out.println("Bank Id"+b1.getBnkId());
		
		BankOver b2=new BankOver();
		b2.setBnkId(102);
		b2.setBnkName("SBI");
		System.out.println("b1==="+b2);
		
	}
	
	public BankOver(int bnkId, String bnkName) {
		super();
		this.bnkId = bnkId;
		this.bnkName = bnkName;
	
	}

@Override
protected Object clone() throws CloneNotSupportedException {
	// TODO Auto-generated method stub
	return super.clone();

	}

static void a2()  {
	
	BankOver b1=new BankOver(101,"kotak");
	try {
		BankOver b2=(BankOver) b1.clone();
	} catch (CloneNotSupportedException e) {
		
		e.printStackTrace();
	}
	
	

	System.out.println();
}
      


     public static void main(String[] args) {
		a1();
		

	}

}
