package HW5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HWP3 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int max = Integer.MAX_VALUE;
		int counter = 0;
		int position = 0;
		int product = 1;
		int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Please enter numbers : " + i);
			arr[i] = Integer.parseInt(br.readLine());
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				counter++;
				if (counter == 2) {
					System.out.println("Second positive number is : " + arr[i]);
					break;
				}
			}
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < max) {
				max = arr[i];
				position = i;
			}
		}
		System.out.println("min is : " + max + " it have position : " + (position + 1));

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Please enter numbers : " + i);
			arr[i] = Integer.parseInt(br.readLine());
			if (arr[i] < 0) {
				arr[i] = 0;
				i--;
				System.out.println("Sorry a negative number");
				continue;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 1) {
				product *= arr[i];
			}
		}
		System.out.println("product of all entered even numbers is : " + product);
	}

}
