package FileInOut;

import java.io.FileInputStream;
import java.io.IOException;

public class Employee {
	
	
	int empId;
	String empName;
	String empCity;
	int salary;
	
	
	
	Employee(int x,String y, String z, int s){
		
		this.empId=x;
		this.empName =y;
		this.empCity= z;
		this.salary=s;
		
	}
	
	
	public String toString() {
		
		return "Employee Id :" + empId + " "+ "Name :" + empName + " "+ " City :" + empCity + " "+ "Salary :"+ salary; 
	}
	
public static void main(String args[]) {
	
	try {
		FileInputStream  fis = new FileInputStream ("/Users/mdmokhlesurrahman/Desktop/Employee.txt");
		
		int av;
		av =fis.available();
		
		
		byte buff[] = new byte[av];
		
		fis.read(buff,0,av);
		
		String buffString= new String(buff);
		
		System.out.println(buffString);
		
		
		
		
		
		
		
		
	} catch (IOException e) {
		
		System.out.println(e);
	}

	
	
	
	
	

}
	}
