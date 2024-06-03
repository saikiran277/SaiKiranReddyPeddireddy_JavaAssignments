package com.ey.Ques1;

public class Studenttest {
	public static void main(String[] args) {
		Studentservice ss= new Studentservice();
		
		
		Address a1=new Address("Guntur");
		student s1=new student("Sai","kiran",a1);
		
		Address a2=new Address("Guntur");
		student s2=new student("Sai","kiran",a1);

		
		
		System.out.println(ss.addProduct(s1));
		System.out.println(ss.addProduct(s2));

		ss.listStudents();
		
		System.out.println(ss.isvalidStudent(s1, s2));
		
	}

}