package com.sakshiDemo;

public class HierarchicalInheritanceAssignment {
	public static void main(String[] args) {

		Bank1 b=new Bank1(12,"Dipak","manchar");
		SavingAccount a=new SavingAccount(23,"surekha","peth",3.5);
		CurrentAccount c=new CurrentAccount(45,"sid","manchar",500);
		FixDipositAccount d=new FixDipositAccount(78,"sakshi","manchar",50000);
		
		System.out.println(b);
		System.out.println(a);
		System.out.println(c);
		System.out.println(d);
		
		
	}

}

class Bank1{
	int Bank1_Id;
	String account_Holder;
	String brach_Name;
	
	
	@Override
	public String toString() {
		return "Bank1 [Bank1_Id=" + Bank1_Id + ", account_Holder=" + account_Holder + ", brach_Name=" + brach_Name + "]";
	}
	
	public Bank1(int Bank1_Id, String account_Holder, String brach_Name) {
		super();
		this.Bank1_Id = Bank1_Id;
		this.account_Holder = account_Holder;
		this.brach_Name = brach_Name;
	}
	
	
	
}

class SavingAccount extends Bank1{
	double interest_Rate;

	
	public SavingAccount(int Bank1_Id, String account_Holder, String brach_Name, double interest_Rate) {
		super(Bank1_Id, account_Holder, brach_Name);
		this.interest_Rate = interest_Rate;
	}

	

	@Override
	public String toString() {
		return "SavingAccount [interest_Rate=" + interest_Rate + ", Bank1_Id=" + Bank1_Id + ", account_Holder="
				+ account_Holder + ", brach_Name=" + brach_Name + "]";
	}

	
	}

	
class CurrentAccount extends Bank1{
	double overdraft_limit;

	public CurrentAccount(int Bank1_Id, String account_Holder, String brach_Name, double overdraft_limit) {
		super(Bank1_Id, account_Holder, brach_Name);
		this.overdraft_limit = overdraft_limit;
	}

	@Override
	public String toString() {
		return "CurrentAccount [overdraft_limit=" + overdraft_limit + ", Bank1_Id=" + Bank1_Id + ", account_Holder="
				+ account_Holder + ", brach_Name=" + brach_Name + "]";
	}
	
}

class FixDipositAccount extends Bank1{
	double diposite_ammount;

	public FixDipositAccount(int Bank1_Id, String account_Holder, String brach_Name, double diposite_ammount) {
		super(Bank1_Id, account_Holder, brach_Name);
		this.diposite_ammount = diposite_ammount;
	}

	@Override
	public String toString() {
		return "FixDipositAccount [diposite_ammount=" + diposite_ammount + ", Bank1_Id=" + Bank1_Id + ", account_Holder="
				+ account_Holder + ", brach_Name=" + brach_Name + "]";
	}	
	
}