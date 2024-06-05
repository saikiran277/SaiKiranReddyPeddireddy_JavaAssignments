package ey.com.Day6;

import java.text.SimpleDateFormat;

public class StackMain {
	public static void main(String[] args) {
		try {
			Stack stack = new Stack(2);
			
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
			
			Contact contact1 = new Contact();
			contact1.setFirstName("Sai");
			contact1.setLastName("Kiran");
			contact1.setDateOfBirth(dateFormat.parse("2001-10-07"));
			contact1.setGender("Male");
			contact1.setMobileNumber("9182916857");
			
			stack.push(contact1);
			System.out.println("Pushed Contact : "+contact1);
			
			Contact contact2 = new Contact();
			contact2.setFirstName("Naresh");
			contact2.setLastName("Chunchu");
			contact2.setDateOfBirth(dateFormat.parse("2002-08-01"));
			contact2.setGender("Male");
			contact2.setMobileNumber("8639904161");
			
			stack.push(contact2);
			System.out.println("Pushed Contact : "+contact2);
			
			Contact popContact = stack.pop();
			System.out.println("Popped Contact : "+popContact.getFirstName()+" "+popContact.getLastName()+"\n ");
			
			stack.pop();
			stack.pop();
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}