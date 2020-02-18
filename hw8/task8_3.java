package hw8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task8_3 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter several three occurrences of US currency:");
		Pattern p = Pattern.compile("\\$(\\d*)(\\.\\d{2})?");
		for (int i = 0; i <= 2; i++) {
			String a = reader.readLine();
			Matcher m = p.matcher(a);
			while (m.find()) {
			System.out.println(a.substring(m.start(), m.end()));
		}
		}
		

	}

}
