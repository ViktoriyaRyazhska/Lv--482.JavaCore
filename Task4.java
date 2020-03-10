package edu5;

public class Task4 {
	public static void execute(String text) {
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
