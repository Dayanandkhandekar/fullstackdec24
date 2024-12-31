package com.sakshiDemo;

public class Student {

	int studentId;
	String studentName;
//Using Setter Method.
	
	
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + "]";
	}








	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

		
		//using Constructor-
		Student(){
			
			System.out.println("inside no argument");//default construction
			
		}
		Student(int a){
			System.out.println("inside parameter ");//no arg construction
		}
		Student(String a){
	    	System.out.println("inside string para arg");//parameter construction
	    
	    	
	    }		
		
		Student(int a,int b){
			System.out.println("parameter constructor for two parameter");
			
		}
		
	
	static void m1() {
	    Student s=new Student();
	    Student s1=new Student(1);
	    Student s2=new Student("");
	    Student s3=new Student(1,6);
	    
	    
	    
	    
		
		s.setStudentId(4);
		s.setStudentName("Sakshi Ghule");
		System.out.println("s=="+s);
		
		s1.setStudentId(8);
		s1.setStudentName("Manasi patil");
		System.out.println("s1=="+s1);
		}
	
	

	
	
	
	
	
	public static void main(String[]args) {
		m1();
		
		
		
		
		
	}

    
   
    }



