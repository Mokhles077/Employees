package com.practise.project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collection {
	
	public static void main(String args[]) {
		
		ArrayList<Student> lists=new ArrayList<Student>();
		
		lists.add(new Student("Mokhles",23,"East West"));
		lists.add(new Student("Rafiq",54,"East West"));
		lists.add(new Student("jahir",44,"East West"));
		lists.add(new Student("karim",24,"East West"));
		
		
	
		
		for(Object e:lists) {
			
			System.out.println(e);
		}
		
		
	}

}
