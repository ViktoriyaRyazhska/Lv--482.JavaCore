package HW3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Appl {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Person p1 = new Person();
		Person p2 = new Person();
		Person p3 = new Person();
		Person p4 = new Person();
		Person p5 = new Person();
		
		p1.input(br); 
		p2.input(br);
		p3.input(br);
		p4.input(br);
		p5.input(br);
		
		p1.Output();
		p2.Output();
		p3.Output();
		p4.Output();
		p5.Output();
		
		p1.changeName("Mariya", "Herasym");
		p1.Output();
	}

}
