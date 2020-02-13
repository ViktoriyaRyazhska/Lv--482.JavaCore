package hw4;

import java.util.Scanner;

public class task4_2 {

	public static void main(String[] args) {

		int[] array = new int[10];
		int sum = 0;
		int product = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the ten numbers:");
		boolean b = true;
		for (int i = 0; i < array.length; i++) {
			array[i] = Integer.parseInt(sc.nextLine());
			if (array[i] > 0 && i < 5 && b) {
				sum = sum + array[i];
	} else {
	b = false;
	}
				if (b == false && i >= 5) {
					product = product * array[i];
					} 
		}
						
		System.out.println("Sum = " + sum);
		System.out.println("Product = " + product);
		sc.close();
	}
}


