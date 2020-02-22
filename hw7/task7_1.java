package hw7;

import java.util.HashSet;
import java.util.Set;

public class task7_1 {

	public static void main(String[] args) {
	
		Set<String> set1 = new HashSet<>();
		set1.add("Ukraine");
		set1.add("Poland");
		set1.add("Slovakia");
		set1.add("Czech Republic");
		set1.add("Romania");
		
		Set<String> set2 = new HashSet<>();
		set2.add("Bulgaria");
		set2.add("Croatia");
		set2.add("Hungary");
		set2.add("Ukraine");
		set2.add("Slovenia");
		
		Set<String> union = new HashSet<>();
		union.addAll(set1);
		union.addAll(set2);
		System.out.println("Set 1 + Set 2: " + union);
		
		set1.retainAll(set2);
		System.out.println("The same elements of two sets: " + set1);

	}

}
