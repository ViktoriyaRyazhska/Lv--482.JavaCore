package hw_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HW_3 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Person person1 = new Person();
		Person person2 = new Person();
		Person person3 = new Person();
		Person person4 = new Person();
		Person person5 = new Person();
		
		person1.input(br); 
		person2.input(br);
		person3.input(br);
		person4.input(br);
		person5.input(br);
		
		person1.output();
		person2.output();
		person3.output();
		person4.output();
		person5.output();
		
	}
}
