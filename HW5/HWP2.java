package HW5;

import java.util.Scanner;

public class HWP2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		int sum = 0;
		int product = 1;

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Please enter i element : " + i + "\n");
			arr[i] = Integer.parseInt(sc.nextLine());
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
		sc.close();
	}
}
