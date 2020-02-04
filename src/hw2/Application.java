package hw2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Application {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				
		Person one = new Person();
		one.input(br);
		one.output();
		
		Person two = new Person();
		two.input(br);
		two.output();
		
		Person three = new Person();
		three.input(br);
		three.output();
		
		Person four = new Person();
		four.input(br);
		four.output();
		
		Person five = new Person();
		five.input(br);
		five.output();
		
		
		
	}

}
