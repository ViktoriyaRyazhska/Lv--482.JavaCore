package hw8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task8_1 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the sentence of five words:");
		String a = reader.readLine();
		String tmp = "";
		String maxWord = "";
		for (int i = 0; i <= a.length(); i++){
			 if (i == a.length() || a.charAt(i) == ' '){
				 maxWord = maxWord.length() < tmp.length() ? tmp : maxWord;
				 tmp = "";
			 }
			 else tmp += a.charAt(i);
				}
		System.out.println("The longest word is: " + maxWord);
		System.out.println("The number of symbols: " + maxWord.length());
		
		String[] c = a.split(" ");
		StringBuilder sb = new StringBuilder(c[1]);
		
			System.out.println(sb.reverse());
			
		
		
}
}

