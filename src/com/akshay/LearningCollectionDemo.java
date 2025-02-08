package com.akshay;

import java.util.ArrayList;
import java.util.List;

public class LearningCollectionDemo {
	public static void main(String[] args) {
		CollectionDemo.m1();
	
	}

}
class CollectionDemo{
	static void m1() {
		List l1=new ArrayList(); //Normal list 
		l1.add(1);
		l1.add(2);
		l1.add("akshay");
		l1.add('a');
		
		List<Integer> l2=new ArrayList<Integer>(l1); //Genrick list
		l2.add(3);
		l2.add(4);
		l2.addAll(l1);
		l2.contains(3);
	
		System.out.println("inside contains="+l2.contains(7));
		System.out.println("inside size="+l2.size());
		System.out.println("Inside l2="+l2);
		System.out.println("inside remove="+l2.remove(2)+l2.remove(1));
		System.out.println("Inside l2="+l2);
		
	}
	
	
}
