package edu5;

public class Task7 {
	public static void execute(int number) {
		if (number < 0) {
			
		}
		int result = 1;
		for (int i = 1; i < number + 1; i++) {
			result *= i;
		}
		System.out.println("factorial of number " + number + " :" + result);
	}
}
