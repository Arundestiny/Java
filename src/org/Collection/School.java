package org.Collection;


public class School {
	
	public School() {
		this("name");
	System.out.println("no argument constructor");
	}

	public  School(String name) {
		this(10);
		System.out.println(name);
	}
	public School(int num){
		
		System.out.println(num);
	}
	

	public static void main(String[] args) {
		School school = new School();


	}


}


