package edu5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task4 {
	public static void execute() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Input some text");
		String text = br.readLine();
		char[] arr = { 'a', 'e', 'i', 'o', 'u', 'y'};
		int count = 0;
		for (char letter : text.toCharArray()) {
			for (char element : arr) {
				if (letter == element) {
					count += 1;
				}
			}
		}
		System.out.println("The amount of loud numbers:" + count);
	}
}
