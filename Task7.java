package edu5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task7 {
	public static void execute() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Input number to factorialize");
		int number = Integer.parseInt(br.readLine());
		if (number < 0) {
			
		}
		int result = 1;
		for (int i = 1; i < number + 1; i++) {
			result *= i;
		}
		System.out.println("factorial of number " + number + " :" + result);
	}
}
