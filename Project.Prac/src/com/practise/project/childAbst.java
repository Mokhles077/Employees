package com.practise.project;

public class childAbst extends Abstract {
	

	@Override
	public void intestine() {
		System.out.println("Food going to intestine");
		
	}
	
	

	@Override
	public void mouth() {
		System.out.println("food going to mouth");
		
		
	}
	
	public static void main(String []args) {
		
		childAbst obj=new childAbst();
		
		
		obj.mouth();
		obj.stomach();
		obj.intestine();
	}

	

}
