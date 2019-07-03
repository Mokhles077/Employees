package com.practise.project;

public class Employee implements Comparable <Employee> {
	
	int empId;
	String empName;
	String city;
	int empSalary;
	
	Employee(int a,String n,String c,int s){
		empId=a;
		empName=n;
		city=c;
		empSalary=s;
	}

		public int compareTo(Employee list2) {
			
			if(this.empSalary>list2.empSalary) {
				return 1;
			}else
				return -1;
			
		}
	
	
	
	public String toString () {
		
		return "Employee ID :" +empId+" "+ " Name :"+ empName +" "+" Salary: "+ empSalary;


}
	}
	
		
	


