package HW8_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Application2 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter in the console sentence that contains the words between more than one space");
		String sentence = reader.readLine();
		String newSentence = sentence.replaceAll("\\s+", " ");
		System.out.println(newSentence);
	}
}