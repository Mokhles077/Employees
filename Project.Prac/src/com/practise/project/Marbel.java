package com.practise.project;

public class Marbel {
 
	public static void main(String args[]) {
		
		
		Marbel obj= new Marbel();
		
		obj.marbel();
		obj.marbel(4);
		obj.marbel(3.4f);
		
	}
	
	
	public void marbel() {
		System.out.println("red marber");
	}
	public void marbel(int x) {
		System.out.println("blue marber");
	}
	public void marbel(float y) {
		System.out.println("green marber");
	}
	
}
