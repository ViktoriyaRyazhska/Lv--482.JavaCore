package hw4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task4_3_2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int product = 1;
		BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
		int a = 0;
		int m = 1;
		System.out.println("Enter the positive numbers (the entering is stoping when you enter negative number:");
		for (int i = 0; i < m; i++) {
		a = Integer.parseInt(reader.readLine());
		if (a > 0) {
			m++;
			if (a%2==0) {
			product = product * a;
			}
		}
			else {
				m++;
				System.out.println("Product: " + product);
				break;
			}
			
		
	}
}
}
	


