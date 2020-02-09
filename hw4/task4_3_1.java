package hw4;

import java.util.Scanner;

public class task4_3_1 {

	public static void main(String[] args) {
		
		int[] array = new int[5];
		int position = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter five numbers:");
		for (int i=0; i <5; i++) {
			array[i] = Integer.parseInt(sc.nextLine());
			}
		/*
		   
		 */
		
			if ((array[0] > 0) && (array[1] > 0)) {
			 position = 1; 
			 System.out.println("The position of second positive number is: " + position);
			 }
		else
			if ((array[0] < 0) && (array[1] > 0) && (array[2] > 0)) { 
				position = 2; 
				System.out.println("The position of second positive number is: " + position);
				}
		else
			if ((array[0] < 0) && (array[1] < 0) && (array[2] > 0) && (array[3] > 0)) { 
				position = 3; 
				System.out.println("The position of second positive number is: " + position);
				}
		else
			if ((array[0] < 0) && (array[1] < 0) && (array[2] < 0) && (array[3] > 0) && (array[4] > 0)) { 
				position = 4; 
				System.out.println("The position of second positive number is: " + position);
				}
		else
			if ((array[0] < 0) && (array[1] < 0) && (array[2] < 0) && (array[3] < 0) && (array[4] > 0) && (array[5] > 0)) {
				position = 5;
				System.out.println("The position of second positive number is: " + position);
				}
		else {
			System.out.println("There are not the second positive number.");
		}
			
			int min = array[0];
			int imin = 0;
			int i = 0;
			while (i < array.length) {
				if (array[i] < min) {
					min = array[i];
					imin = i;
				}
				i++;
			}
			System.out.println("Minimum = " + min);
			System.out.println("Minimum is in " + imin + " place.");
			sc.close();
	}

}
