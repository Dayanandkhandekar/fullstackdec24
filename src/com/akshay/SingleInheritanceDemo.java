package com.akshay;

public class SingleInheritanceDemo {
	public static void main(String[] args) {
	//Demo d = new Demo();
	//Demo d1=new Demo(1);
	//Demo d2=new Demo(2,3);
		Emp e= new Emp(1,"Akshay",15000);
		PEmp p=new PEmp(2,"sushant",20000,5000);
		System.out.println(e);
		System.out.println(p);

	}
	

}
class Emp{
	
 int empId;
 String empName;
 double empSalary;
@Override
public String toString() {

	return "Emp [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + "]";
}
public Emp(int empId, String empName, double empSalary) {
	super();
	this.empId = empId;
	this.empName = empName;
	this.empSalary = empSalary;
}

}
class PEmp extends Emp {
	double bonus;

	public PEmp(int empId, String empName, double empSalary, double bonus) {
		super(empId, empName, empSalary);
		this.bonus = bonus;
	}

	@Override
	public String toString() {
		return "PEmp [bonus=" + bonus + ", empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + "]";
	}
	
}
class CEmp{
	int duration;
}
class Demo{
	
	Demo(){
		this(1);
		System.out.println("Inside No args");
		
	}
	Demo( int a){
		this(2,3);
		System.out.println("inside single parameter");
	}
	Demo(int a,int b){
		System.out.println("Inside two parameter");
		
	}
}










