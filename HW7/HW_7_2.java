/*
 * Enter a sentence that contains the words between more than one space. 
 * Convert all spaces, consecutive, one. 
 */

package hw_7;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HW_7_2 {

	public static void main(String[] args) {
		String pattern = "[A-Za-z]+";
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter sentence, please");
		String sentence = scanner.nextLine();
		scanner.close();
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(sentence);
		while (m.find()) {
			System.out.print(sentence.substring(m.start(), m.end()) + " ");
		}
	}

}
