package Hw4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		Dog t = new Dog();
		Dog d1 = new Dog();
		d1.input(reader);
		Dog d2 = new Dog();
		d2.input(reader);
		Dog d3 = new Dog();
		d3.input(reader);
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);

		t = d1.olddog(d2.olddog(d3));

		System.out.println("The oldest dog " + " " + t.Output());

		t = (d1.sameName(d2.sameName((d3))));
		System.out.print("Same names :" + "\n" + t);

	}
}