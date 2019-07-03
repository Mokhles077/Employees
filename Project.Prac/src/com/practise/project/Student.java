package com.practise.project;

public class Student  {
	
	String studentName;
	int studentId;
	String universityName;
	
	
	Student(String sN, int sid, String uN){
		studentName=sN;
		studentId=sid;
		universityName=uN;
		
	}
	
	
	public String toString() {
		
		return "Student: StudnetName: "+studentName+"  "+"Student ID: "+studentId+
				" "+" University Name: "+universityName;
		
	}
	

}
