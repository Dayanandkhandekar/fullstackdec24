package com.akshay;

public class HerachicalInheritance {
	public static void main(String[] args) {
		Bank0 b1=new Bank0(1,"SBI",123.00);
		System.out.println(b1);
		GovermentBank0 g1=new GovermentBank0(2,"BOI",112.00,9.20);
		System.out.println(g1);
		PrivateBank0 p1=new PrivateBank0(3,"BOB",110.00,8);
		System.out.println(p1);
	}
}
class Bank0{
	int Bank0Id;
	String Bank0Name;
	double accountNo;
	@Override
	public String toString() {
		return "Bank0 [Bank0Id=" + Bank0Id + ", Bank0Name=" + Bank0Name + ", accountNo=" + accountNo + "]";
	}
	public Bank0(int bank0Id, String bank0Name, double accountNo) {
		super();
		Bank0Id = bank0Id;
		Bank0Name = bank0Name;
		this.accountNo = accountNo;
	}
	
	
}
class GovermentBank0 extends Bank0 {
	double interest;

	@Override
	public String toString() {
		return "GovermentBank0 [interest=" + interest + ", Bank0Id=" + Bank0Id + ", Bank0Name=" + Bank0Name + ", accountNo="
				+ accountNo + "]";
	}

	public GovermentBank0(int bank0Id, String bank0Name, double accountNo, double interest) {
		super(bank0Id, bank0Name, accountNo);
		this.interest = interest;
	}

	
}
class PrivateBank0 extends Bank0{
	int interest;

	

	@Override
	public String toString() {
		return "PrivateBank0 [interest=" + interest + ", Bank0Id=" + Bank0Id + ", Bank0Name=" + Bank0Name
				+ ", accountNo=" + accountNo + "]";
	}



	public PrivateBank0(int bank0Id, String bank0Name, double accountNo, int interest) {
		super(bank0Id, bank0Name, accountNo);
		this.interest = interest;
	}

}