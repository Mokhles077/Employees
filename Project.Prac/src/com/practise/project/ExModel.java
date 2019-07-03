package com.practise.project;

import java.util.Scanner;

public class ExModel {
	public static void main(String args[]) {
		
		int arr[]= {2,3,0},num2=32, num3, result;
		
		try
		{
			Scanner input= new Scanner(System.in);
			
			System.out.println("Enter your number please :");
			num3=input.nextInt();
				
		result=num2/arr[num3];  
		
		System.out.println("Result:"+result);
		}
		
		
		catch(ArithmeticException e) {
			System.out.println("Exception Occured:"+e);
		}
		
		catch(ArrayIndexOutOfBoundsException d) {
			System.out.println("Exception Occured:"+d);
		}
		
		catch(Exception d) {
			System.out.println("Exception Occured:"+d);
		}
		finally {
		
		System.out.println("After the Exception");
		}
		
		
		
		
	}

}
