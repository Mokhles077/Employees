package FileInOut;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ManageEmployee {

	public static void main(String[] args) {
		
		ArrayList<Employee> list= new ArrayList <Employee> ();
		
		char ch;
		
		Scanner input= new Scanner(System.in);
		
		int empId;
		String empName;
		String empCity;
		int salary;
		
		
			while (true) {
				
				System.out.println("Enter your Choice: 1. All Employee details 2. Delete Employee 3. Sort City 4. Sort Salary 5. Exit");
				ch=input.next().charAt(0);
				
				
				switch (ch) {
				
				case '1': 
					
					
					list.addAll(list);
					
					
					break;
					
				case '2':
					
					break;
					
				case '3':
					
					
						Collections.sort(list, new SortCity());
						
							for(Employee cits:list) {
								System.out.println("Sorting by City :" + cits);
							}
						break;
							
				case '4':
					
					Collections.sort(list, new SortSalary());
					
					for(Employee salr:list) {
						System.out.println("Sorting by Salary :" + salr);
					}
					
					 break;
					 
				case '5':
					
					System.exit(0);
					
					break;
					
			
				
				
				}
				
			}
			
		
		
		
		
		
		
	}

}
