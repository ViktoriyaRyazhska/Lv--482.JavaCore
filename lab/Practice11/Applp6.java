package Practice11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Applp6 {
	public static void main(String[] args) {
	List<String> list = Arrays.asList("h","as","k","dhfd","ej","f");
	System.out.println(Sort(list));
		
	}
	
	
	private static List<String> Sort(List <String> name) {
		return name.stream().sorted().collect(Collectors.toList());
	}
	
		
}
