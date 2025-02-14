package com.sushantdemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class MapWorkingCopy {
	public static void main(String[] args) {
		m1();
	}
	static void m1()
	{
	 Map<Student10, String> map1= new HashMap<Student10, String>();
	 Student10 s1=new Student10(1,"Akshay",99);
	 Student10 s2=new Student10(2,"Sushant",100);
	 Student10 s3=new Student10(3,"Sakshiii",75);
	 Student10 s4=new Student10(4,"Ajay",70);
	 
	 map1.put(s1, "A");
	 map1.put(s2, "B");
	 map1.put(s3, "C");
	 map1.put(s4, "D");
	 
	 System.out.println("Map1="+ map1);
	
	 
	}
}
class Student10{
	int sId;
	String sName;
	int sMarks;
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public int getsMarks() {
		return sMarks;
	}
	public void setsMarks(int sMarks) {
		this.sMarks = sMarks;
	}
	@Override
	public String toString() {
		return "Student10 [sId=" + sId + ", sName=" + sName + ", sMarks=" + sMarks + "]\n";
	}
	public Student10(int sId, String sName, int sMarks) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.sMarks = sMarks;
	}
	@Override
	public int hashCode() {
		return Objects.hash(sId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student10 other = (Student10) obj;
		return sId == other.sId;
	}
	

}
