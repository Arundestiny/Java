package org.Collection;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class College {

	public static void main(String[] args) {
		
		List<Integer> li = new ArrayList<Integer>(); 
		li.add (10);
		li.add (20);
		li.add (30);
		li.add (90);
		li.add (10);
		li.add (10);
		li.add (40);
		li.add (50);
		
	System.out.println(li);
	
	li.remove(5);
     System.out.println(li);	
	
     List<Integer>l2 = new ArrayList<>();
	l2.addAll(li);
	
	l2.clear();
	System.out.println(l2);
	
	li.add(70);
	System.out.println(li);
    
	li.set(5, 100); 
	System.out.println(li);
	
	System.out.println(li.isEmpty());
	
	int size=li.size();
	System.out.println(size);
	
	int indexOf=li.indexOf(10);
	System.out.println(indexOf);
	
	int lastindexOf=li.lastIndexOf(10);
	System.out.println(lastindexOf);
	
	Integer integer= li.get(7);
	System.out.println(integer);
	
	for(int i=0; i<li.size();i++){
	Integer c =li.remove(i);
	if(c.equals(10));
	System.out.println(i);
	
	}
}}