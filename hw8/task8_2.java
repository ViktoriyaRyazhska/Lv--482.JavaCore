package hw8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task8_2 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a sentence that contains the words between more than one space:");
		String a = reader.readLine();
		a = a.replaceAll("\\s+", " ");
		System.out.println(a);
	}

}
