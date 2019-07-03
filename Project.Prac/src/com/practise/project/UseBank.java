package com.practise.project;

import java.util.Scanner;

public class UseBank {
	
	int initialAmount =2000;
	
	public void withdrawAmount(int amount) throws BankException{
		
		if (initialAmount-amount<1000) {
			throw new BankException();
		}
		else
			System.out.println("Successful Transaction Completed");
		
	}

	public static void main(String[] args) {
		
		
		int amount;
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter your amount to Withdraw :");
		
		amount=input.nextInt();
		
		UseBank obj=new UseBank();
		
		try {
			obj.withdrawAmount(amount);
		}
		catch(BankException e) {
			System.out.println(e);
		}
		
		
		
		

	}

}
