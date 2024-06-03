package com.ey.Ques1;

import java.util.*;

public class Studentservice {
	
	Set<student> plist=new HashSet<>();
	
	public String addProduct(student s) {
		plist.add(s);
		return "Student added sucessfully";
		}
	public void  listStudents(){
		plist.forEach(x->System.out.println(x));
	}
	public boolean isvalidfn(Object o1, Object o2) {
		student s1=(student)o1;
		student s2=(student)o2;
		if(s1.firstname.equals(s2.firstname)){
			return true;
		}
		else
			return false;
	}
	public boolean isvalidln(Object o1, Object o2) {
		student s1=(student)o1;
		student s2=(student)o2;
		if(s1.lastname.equals(s2.lastname)){
			return true;
		}
		else
			return false;
	}
	public String isvalidStudent(Object o1, Object o2) {
		if(isvalidfn(o1, o2) && isvalidln(o1, o2))
			return "Match";
		else
			return "Not match";
	}
	
}