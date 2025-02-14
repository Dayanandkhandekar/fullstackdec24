package com.ajaydemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class CollectionMap {

	public static void main(String[] args) {
		//m1();
		m2();
		

	}
     static void m1() {
		
		Map<Integer,String> m1=new  HashMap<Integer, String>();
		m1.put(1, "Ajay");
		m1.put(2, "Akshay");
		String m=m1.put(2, "Sushant");
		System.out.println(m);
		
		m1.put(4, "Sakshi");
		m1.put(5, "Suraj");
		System.out.println("map"+m1);
		
		
	}
    static void m2() {
    	 Map<EmployeeCollection, String> m2=new HashMap<EmployeeCollection, String>();
    	 EmployeeCollection e1=new EmployeeCollection(1,"raj",90744);
    	 EmployeeCollection e2=new EmployeeCollection(2,"sachin",6464);
    	 EmployeeCollection e3=new EmployeeCollection(3,"akash",75864);
    	 EmployeeCollection e4=new EmployeeCollection(4,"pravin",89608);
    	 EmployeeCollection e5=new EmployeeCollection(5,"vijay",90654);
    	 
    	 m2.put(e1, "A");
    	 m2.put(e2, "B");
    	 m2.put(e3, "C");
    	 m2.put(e3, "D");
    	 String c=m2.put(e3, "D");
    	 System.out.println("C");
    	 m2.put(e5, "E");
    	 System.out.println("m2"+m2);
    	 
     }
}
class EmployeeCollection{
	int eId;
	String eName;
	int eSalary;
	@Override
	public String toString() {
		return "EmployeeCollection [eId=" + eId + ", eName=" + eName + ", eSalary=" + eSalary + "]\n";
	}
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public int geteSalary() {
		return eSalary;
	}
	public void seteSalary(int eSalary) {
		this.eSalary = eSalary;
	}
	public EmployeeCollection(int eId, String eName, int eSalary) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.eSalary = eSalary;
	}
	
	
	
	
}
