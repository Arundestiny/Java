package org.bike;

public  class Ktm implements Bike {

	@Override
	public void cost() {
	System.out.println("0ne lakh");
	
		
	}

	@Override
	public void speed() {
	System.out.println("160 kmph");
	
		
	}
	public static void main(String[]args) {
		Ktm k= new Ktm();
         k.cost();
         k.speed();
	
	
	  
}
}    