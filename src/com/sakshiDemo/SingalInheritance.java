package com.sakshiDemo;

public class SingalInheritance {
	
	public static void main(String[] args) {
	
	Student1 s=new Student1(1, 3,"sakshi");
	RStudent1 rs=new RStudent1(2,2,"mansi","yes");
	 System.out.println(s);
	 System.out.println(rs);
}
}
	
	
	class Student1 {
		int s_Id;
		int s_div;
		String s_Name;
		
		
		@Override
		public String toString() {
			return "Student1 [s_Id=" + s_Id + ", s_div=" + s_div + ", s_Name=" + s_Name + "]";
		}
		
		
		public Student1(int s_Id, int s_div, String s_Name) {
			super();
			this.s_Id = s_Id;
			this.s_div = s_div;
			this.s_Name = s_Name;
		}
       
		
		
	}

	class RStudent1 extends Student1{
		String Student1_Regular;

		public RStudent1(int s_Id, int s_div, String s_Name, String Student1_Regular) {
			super(s_Id, s_div, s_Name);
			this.Student1_Regular = Student1_Regular;
		}

		@Override
		public String toString() {
			return "RStudent1 [Student1_Regular=" + Student1_Regular + ", s_Id=" + s_Id + ", s_div=" + s_div + ", s_Name="
					+ s_Name + "]";
		}
		
		
	}
	
	
	

