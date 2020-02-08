package hw4;

import java.util.Scanner;

public class task4_2 {

	public static void main(String[] args) {
		
		int[] array = new int[10];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter ten numbers:");
		array[0] = Integer.parseInt(sc.nextLine());
		array[1] = Integer.parseInt(sc.nextLine());
		array[2] = Integer.parseInt(sc.nextLine());
		array[3] = Integer.parseInt(sc.nextLine());
		array[4] = Integer.parseInt(sc.nextLine());
		array[5] = Integer.parseInt(sc.nextLine());
		array[6] = Integer.parseInt(sc.nextLine());
		array[7] = Integer.parseInt(sc.nextLine());
		array[8] = Integer.parseInt(sc.nextLine());
    	array[9] = Integer.parseInt(sc.nextLine());
    	
		int sum = 0;
		int product = 1;
		
		if (array[0]>0 && array[1]>0 && array[2]>0 && array[3]>0 && array[4]>0) {
			sum = array[0] + array[1] + array[2] + array[3] + array[4];
			}
		
		else {
			product = product * array[5] * array[6] * array[7] * array[8] * array[9];
			}
		
		System.out.println("Sum = " + sum);
		System.out.println("Product = " + product);
		sc.close();
	}
}
	

		
		
		
	
	


