package practiktask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task10 {
	public static void execute() throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n;
		System.out.println("Please enter number");
		n = Integer.parseInt(br.readLine());
		int counter = 0;
		while (n != 1) {

			if (n % 2 == 0) {
				n = n / 2;
			} else {

				n = n * 3 + 1;
			}
			counter++;
		}
		System.out.println(counter);
	}
}