package practic12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {

	public static void main(String[] args) throws IOException {
		int countCharacters = 0;
		String testWord;
		String character = "";
		String character1 = "";
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Input word");
		testWord = br.readLine();
		System.out.println("Input character");
		character1 = br.readLine();
		for (int i = 0; i < testWord.length(); i++) {
			character = testWord.substring(i, i + 1);
			if (character.equals(character1))
				countCharacters++;
		}
		System.out.println("There are character" + character + " " + countCharacters + " times in the word " + testWord);

	}

}
