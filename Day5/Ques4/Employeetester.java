package com.ey.Ques4;

public class Employeetester {
	public static void main(String[] args) {
		Employeevalidator ev= new Employeevalidator();
		Employee e1=new Employee(1,"sai","kiran");
		Employee e2=new Employee(2,"bolla","devender");
		Employee e3=new Employee(3,"maxwell","Glenn");
		Employee e4=new Employee(4,"raj","kumar");
		Employee e5=new Employee(5,"jagan","mohan");
		ev.addemployee(e1);
		ev.addemployee(e2);
		ev.addemployee(e3);
		ev.addemployee(e4);
		ev.addemployee(e5);
		
		ev.list();
		
		ev.fnamesort();
		
	}

}