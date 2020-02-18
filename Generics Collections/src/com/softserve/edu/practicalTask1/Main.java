package com.softserve.edu.practicalTask1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List<Integer> list=new ArrayList<>();
		int i=0;
		do {
			System.out.println("Input integer on position "+i+":");
			list.add(sc.nextInt());
			i++;
		}while(i<10);
	
		System.out.println("");
		System.out.println("Original list:");
		System.out.println(list);
		
		List<Integer> newList=new ArrayList<>();
		
		for(int j=0;j<list.size();j++) {
			if(list.get(j)>5) {
				newList.add(j);
			}
		}
		
		System.out.println("");
		System.out.println("New list list:");
		System.out.println(newList);
		
		Iterator<Integer> it = list.iterator( );
	    while (it.hasNext( )) {
	    	if(it.next()>20) {
	    		it.remove();
	    	}
	    }
	    
	    System.out.println("");
	    System.out.println("Original list after removing elements which are greater than 20:");
		System.out.println(list);
		
		list.add(2,1);
		list.add(8,-3);
		list.add(5,-4);
		for (int k=0;k<list.size();k++) {
	    		System.out.println("position: ["+k+"] value: ["+list.get(k)+"]");
	    }
		
		Collections.sort(list);
		System.out.println("");
	    System.out.println("Original list after sorting elements");
		System.out.println(list);
	}
}
