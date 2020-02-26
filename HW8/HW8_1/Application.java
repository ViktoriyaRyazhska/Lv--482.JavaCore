package HW8_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Application {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter in the console sentence of five words");
		String sentence = reader.readLine();
		String[] words = sentence.split("\\s");
		String word = getLongestWord(words);
		getCountOfLetters(word);
		bringSecondWordInReverse(words);
	}

	public static String getLongestWord(String[] arr) {
		String longestWord = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (longestWord.length() < arr[i].length()) {
				longestWord = arr[i];
			}
		}
		System.out.println("The longest word in sentence is a word " + "\"" + longestWord + "\".");
		return longestWord;
	}

	public static void getCountOfLetters(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (!Character.isWhitespace(str.charAt(i))) {
				count += 1;
			}
		}
		System.out.println("The count of letters of this word is " + count + ".");
	}

	public static void bringSecondWordInReverse(String[] arr) {
		String secondWord = arr[1];
		String reversSecondWord = "";
		for (int i = secondWord.length() - 1; i >= 0; i--) {
			reversSecondWord = reversSecondWord + secondWord.charAt(i);
		}
		arr[1] = reversSecondWord;
		String joinedWords = String.join(" ", arr);
		System.out.println(joinedWords);
	}
}