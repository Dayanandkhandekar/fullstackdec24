package com.sakshiDemo;

public class MultilevelInheritaceAssignment {
	
	public static void main(String[] args) {
		Employee1 e=new Employee1(123,"sakshi",20000);
		PEmployee1 pe=new PEmployee1(321,"pratiksha",25000,10000);
		CEmployee1 ce=new CEmployee1(456,"mansi",15000,2000,6);
		

		
		
		System.out.println(e);
		System.out.println(pe);
		System.out.println(ce);
	}

}

class Employee1{
	int emp_Id;
    String emp_Name;
    double emp_Salary;
	@Override
	public String toString() {
		return "Employee1 [emp_Id=" + emp_Id + ", emp_Name=" + emp_Name + ", emp_Salary=" + emp_Salary + "]";
	}
	public Employee1(int emp_Id, String emp_Name, double emp_Salary) {
		super();
		this.emp_Id = emp_Id;
		this.emp_Name = emp_Name;
		this.emp_Salary = emp_Salary;
	}
    
    
}

class PEmployee1 extends Employee1{
	double Employee1_Bonus;

	public PEmployee1(int emp_Id, String emp_Name, double emp_Salary, double Employee1_Bonus) {
		super(emp_Id, emp_Name, emp_Salary);
		this.Employee1_Bonus = Employee1_Bonus;
	}

	@Override
	public String toString() {
		return "PEmployee1 [Employee1_Bonus=" + Employee1_Bonus + ", emp_Id=" + emp_Id + ", emp_Name=" + emp_Name
				+ ", emp_Salary=" + emp_Salary + "]";
	}
	
	

	
	
}

class CEmployee1 extends PEmployee1{
	int duration;

	public CEmployee1(int emp_Id, String emp_Name, double emp_Salary, double Employee1_Bonus, int duration) {
		super(emp_Id, emp_Name, emp_Salary, Employee1_Bonus);
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "CEmployee1 [duration=" + duration + ", Employee1_Bonus=" + Employee1_Bonus + ", emp_Id=" + emp_Id
				+ ", emp_Name=" + emp_Name + ", emp_Salary=" + emp_Salary + "]";
	}
	
}