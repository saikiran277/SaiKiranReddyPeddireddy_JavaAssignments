package com.ey.Ques5;

import java.util.*;

import com.ey.Ques4.Employee;

public class Queueimp {

	public static void main(String[] args) {
		Queue<Object> q= new LinkedList<>();
		q.add(1);
		q.add("sk");
		q.add(7.8);
		q.add(8.7f);
		q.add(true);
		q.add(Employee.class);
		System.err.println(q);
		
	}
	
}