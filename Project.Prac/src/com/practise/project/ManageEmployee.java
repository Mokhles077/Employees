package com.practise.project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ManageEmployee {

	public static void main(String[] args) {
		
		ArrayList<Employee> list1 = new ArrayList <Employee>();
		
		list1.add(new Employee(1001,"Sridhar","Hyderabad",13000));
		list1.add(new Employee(1002,"Ravi","New Delhi",34000));
		list1.add(new Employee(1003,"Vinod","Chennai",35000));
		list1.add(new Employee(1004,"Wasim","Lucknow",32000));
		list1.add(new Employee(1005,"Rabbani","Pune",23000));
		
		
		
		
		Collections.sort(list1);
		
		
		for (Employee l: list1) {
			System.out.println(l);
			
		}

	}

}
