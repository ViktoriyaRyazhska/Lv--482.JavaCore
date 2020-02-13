package hw4;

import java.util.Arrays;
import java.util.Scanner;

public class task4_3_1 {

	public static void main(String[] args) {

		int[] array = new int[5];
		int position = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter five numbers:");
		for (int i = 0; i < 5; i++) {
			//array[i] = i - 2;
			array[i] = sc.nextInt();

		}
		System.out.println(Arrays.toString(array));

		int cout = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] > 0) {
				cout++;
				position = i;
			}
			if (cout == 2)
				break;
		}
		System.out.println("The position of second positive number is: " + position);

		sc.close();
	}

}
