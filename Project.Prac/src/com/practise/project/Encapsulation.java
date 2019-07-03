package com.practise.project;

public class Encapsulation {
	
	private int x;

	public int getX() {
		
		return x;
	}
	
	public void setX(int a) {
		this.x=a;
	}
	
	
	public static void main(String args[]) {
		
		Encapsulation enCap= new Encapsulation();
		enCap.setX(32);
	
		System.out.println("Encapsulation value is ="+ enCap.getX());
	
		
	}

}
