package hw_8;

import java.util.HashSet;
import java.util.Set;

public class ApplSet {

	public static void main(String[] args) {

		Set<String> set1 = new HashSet<>();
		set1.add("apple");
		set1.add("cherry");
		set1.add("pear");
		set1.add("plum");
		set1.add("peach");
		Set<String> set2 = new HashSet<>();
		set2.add("strawberry");
		set2.add("apple");
		set2.add("blackberry");
		set2.add("pear");

		System.out.println("objects of set1 are " + set1);
		System.out.println("objects of set2 are " + set2);
		
		Set<String> set = new HashSet<>();
		set.addAll(set1);
		set1.addAll(set2);
		System.out.println(" objects of union of set1 and set2 are " + set1);
		set.retainAll(set2);
		System.out.println(" objects of intersection of set1 and set2 are " + set);

	}

}
