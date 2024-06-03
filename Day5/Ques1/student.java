package com.ey.Ques1;


public class student {
	String firstname;
	String lastname;
	Address address;
	public student(String firstname, String lastname, Address address) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [firstname=" + firstname + ", lastname=" + lastname + ", address=" + address + "]";
	}
	
}
class Address{
	String adress;

	public Address(String adress) {
		super();
		this.adress = adress;
	}
	
	
}