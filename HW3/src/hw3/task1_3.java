package hw3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task1_3 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of HTTP error (from 400 to 405):");
		int a = Integer.parseInt(reader.readLine());

		Text text = Text.BAD_REQUEST;
		
		switch (a) {
		case 400: 
			text = Text.BAD_REQUEST; break;
		case 401: 
			text = Text.UNAUTORIZED; break;
		case 402: 
			text = Text.PAYMENT_REQUIRED; break;
		case 403: 
			text = Text.FORBIDDEN; break;
		case 404: 
			text = Text.NOT_FOUND; break;
		case 405: 
			text = Text.METHOD_NOT_ALLOWED; break;
		default:
			System.out.println("No this error!");
			System.exit(0);
		}
		System.out.println(text);

	}

}
