package com.sakshiDemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class MapDemo {
	public static void main(String[] args) {
		//m1();
		m2();
	}
	static void m1() {
		Map<Integer,String> map1=new HashMap<Integer,String>();
		map1.put(1, "A");
		String a=map1.put(1, "X");
		System.out.println(a);
		map1.put(2, "Y");
		map1.put(3, "Z");
		System.out.println("map 1="+map1);
		
	}
	
	static void m2() {
		Map <employee4,String> map2=new HashMap<employee4,String>();
		employee4 e1=new employee4(1, "SG", 25000);
		employee4 e2=new employee4(2, "AB", 30000);
		employee4 e3=new employee4(3, "SB", 28000);
		employee4 e4=new employee4(4, "AJ", 30000);
		
		map2.put(e1, "A");
		map2.put(e2, "B");
		map2.put(e3, "C");
		map2.put(e4, "D");
		System.out.println("Map 2="+map2);
		
	}

}
class employee4{
	int e_id;
	String e_name;
	int e_salary;
	@Override
	public String toString() {
		return "employee4 [e_id=" + e_id + ", e_name=" + e_name + ", e_salary=" + e_salary + "\n]";
	}
	public int getE_id() {
		return e_id;
	}
	public void setE_id(int e_id) {
		this.e_id = e_id;
	}
	public String getE_name() {
		return e_name;
	}
	public void setE_name(String e_name) {
		this.e_name = e_name;
	}
	public int getE_salary() {
		return e_salary;
	}
	public void setE_salary(int e_salary) {
		this.e_salary = e_salary;
	}
	public employee4(int e_id, String e_name, int e_salary) {
		super();
		this.e_id = e_id;
		this.e_name = e_name;
		this.e_salary = e_salary;
	}
	@Override
	public int hashCode() {
		return Objects.hash(e_id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		employee4 other = (employee4) obj;
		return e_id == other.e_id;
	}
	
	
	
}
