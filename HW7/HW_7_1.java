package hw_7;

import java.util.Scanner;

public class HW_7_1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter sentence, please");
		String sentence = scanner.nextLine();
		scanner.close();

		String[] arr = sentence.split(" ");

		StringBuilder sb = new StringBuilder(arr[1]);
		sb.reverse();
		String str = sb.toString();
		System.out.println("The second word in the sentence in reverse order looks like - " + str);

		int longest = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i].length() > arr[longest].length()) {
				longest = i;
			}
		}
		System.out.print("The longest word in the sentence is " + arr[longest]);
		System.out.println(". Its length is " + arr[longest].length() + " symbols");

	}

	private static Object reverse() {
		return null;
	}
}
