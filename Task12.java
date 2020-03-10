package edu5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task12 {
	public static void execute() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Input a number");
		int number = Integer.parseInt(br.readLine());
		int sum = 0;
		for (int i = 0; i < number; i++) {
			if ((i % 3 == 0) | (i % 5 == 0)) {
				sum += i;
			}
		}
		System.out.println("The sum of all the multiples of 3 or 5 below " + number + " :" + sum);
	}
}
