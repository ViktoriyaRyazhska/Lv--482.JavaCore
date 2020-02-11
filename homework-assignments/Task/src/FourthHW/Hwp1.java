package FourthHW;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Hwp1 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int value = 0;
		System.out.println("Please enter month : ");
		value = Integer.parseInt(reader.readLine());
		int[] arr = new int[12];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("amount of days  : " + i);
			arr[i] = Integer.parseInt(reader.readLine());

		}
		if (value >= 0 && value <= 12) {
			System.out.println("value is : " + arr[value]);
		}

	}

}
