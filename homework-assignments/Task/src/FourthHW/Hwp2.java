package FourthHW;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Hwp2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int value = 0;
		int sum = 0;
		int product = 1;

		value = Integer.parseInt(br.readLine());

		int[] arr = new int[value];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Please enter i element : " + i + "\n");
			arr[i] = Integer.parseInt(br.readLine());
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= 0 && i < 5) {
				sum += arr[i];
			} else if (arr[i] < 0 && i < 5) {
				sum = 0;
			} else if (i >= 5) {
				product *= arr[i];
			}

		}

		System.out.println("sum is : " + sum);
		System.out.println("product is : " + product);
	}
}
