package edu5;

public class Task12 {
	public static void execute(int number) {
		int sum = 0;
		for (int i = 0; i < number; i++) {
			if ((i % 3 == 0) | (i % 5 == 0)) {
				sum += i;
			}
		}
		System.out.println("The sum of all the multiples of 3 or 5 below " + number + " :" + sum);
	}
}
