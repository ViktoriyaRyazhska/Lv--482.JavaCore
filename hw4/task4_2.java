package hw4;

import java.util.Scanner;

public class task4_2 {

	public static void main(String[] args) {

		int[] array = new int[10];
		int sum = 0;
		int product = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the ten numbers:");
		for (int i = 0; i < array.length; i++) {
			array[i] = Integer.parseInt(sc.nextLine());
				if (array[i] > 0) {
				sum = array[0] + array[1] + array[2] + array[3] + array[4];
			}
				else {
				product = product * array[5] * array[6] * array[7] * array[8] * array[9];
					}	
		}
						
		System.out.println("Sum = " + sum);
		System.out.println("Product = " + product);
		sc.close();
	}
}


