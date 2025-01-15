package com.sushantdemo;

public class MultilevelInheritanceAssi {
	public static void main(String[] args) {
		
	
	Employee e=new Employee(001, "John", 100000);
	tempEmployee e1=new tempEmployee(002, "mike", 80000, 10000);
	permanentEmployee e2=new permanentEmployee(003, "Doremon",200000, 15000, 15000);
	ContractBasisEmployee e3=new ContractBasisEmployee(004, "Chery", 40000, 10000, 2000, 18);
	System.out.println(e);
	System.out.println(e1);
	System.out.println(e2);
	System.out.println(e3);
	}
}
class Employee {
	int eId;
	String eName;
	int payment;
	public Employee(int eId, String eName, int payment) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.payment = payment;
	}
	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", eName=" + eName + ", payment=" + payment + "]";
	}
	
}
class tempEmployee extends Employee {
	int incentive;

	public tempEmployee(int eId, String eName, int payment, int incentive) {
		super(eId, eName, payment);
		this.incentive = incentive;
	}

	@Override
	public String toString() {
		return "tempEmployee [incentive=" + incentive + ", eId=" + eId + ", eName=" + eName + ", payment=" + payment
				+ "]";
	}

}
class permanentEmployee extends tempEmployee{
	int bonus;

	public permanentEmployee(int eId, String eName, int payment, int incentive, int bonus) {
		super(eId, eName, payment, incentive);
		this.bonus = bonus;
	}

	@Override
	public String toString() {
		return "permanentEmployee [bonus=" + bonus + ", incentive=" + incentive + ", eId=" + eId + ", eName=" + eName
				+ ", payment=" + payment + "]";
	}

}
class ContractBasisEmployee extends permanentEmployee {
	int contractMonts;

	public ContractBasisEmployee(int eId, String eName, int payment, int incentive, int bonus, int contractMonts) {
		super(eId, eName, payment, incentive, bonus);
		this.contractMonts = contractMonts;
	}

	@Override
	public String toString() {
		return "ContractBasisEmployee [contractMonts=" + contractMonts + ", bonus=" + bonus + ", incentive=" + incentive
				+ ", eId=" + eId + ", eName=" + eName + ", payment=" + payment + "]";
	}

	}
