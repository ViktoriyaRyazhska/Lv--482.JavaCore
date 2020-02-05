package edu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		// Task1;
//		int months[] = new int[12];
//		months[0] = 31;
//		months[1] = 28;
//		months[2] = 31;
//		months[3] = 30;
//		months[4] = 31;
//		months[5] = 30;
//		months[6] = 31;
//		months[7] = 31;
//		months[8] = 30;
//		months[9] = 31;
//		months[10] = 30;
//		months[11] = 31;
//		System.out.println("Input number of month");
//		int mymonth = Integer.parseInt(br.readLine());
//		System.out.println(months[mymonth]);
//		// Task2;
//		int myarr[] = new int[10];
//		int check = 0;
//		System.out.println("Input 10 int numbers");
//		for (int i=0;i<myarr.length;i++) {
//			myarr[i] = Integer.parseInt(br.readLine());
//			if (myarr[i] > 0) {
//				check += 1;
//			} else if (myarr[i] < 0) {
//				check += -1;
//			}
//		}
//		int sum = 0;
//		int product = 1;
//		if (check == 10) {
//			for (int i = 0; i < myarr.length / 2; i++) {
//				sum += myarr[i];
//			}
//			System.out.println("Sum of first 5 elements:" + sum);
//		} else if (check == -10) {
//			for (int i = myarr.length / 2; i < myarr.length; i++) {
//				product *= myarr[i];
//			}
//			System.out.println("Product of last 5 elements:" + product);
//		}
//		else {
//			System.out.println("Elements aren't all positive or negative");
//		}
		// Task3
		int array[] = new int[5];
		int count = 0;
		int prod = 1;
		int position = -10;
		int min = Integer.MAX_VALUE;
		System.out.println("Input 5 int numbers");
		for (int i = 0; i < array.length; i++) {
			array[i] = Integer.parseInt(br.readLine());
			if (array[i] < 0) {
				break;
			}
		}
		for (int i = 0; i < array.length; i++) {
			if (array[i] > 0) {
				count += 1;
			}
			if (count == 2) {
				System.out.println("Position of second positive number:" + i);
				count += 1;
			}
			if (array[i] < min) {
				min = array[i];
				position = i;
			}
			if ((array[i] % 2) == 0 && (array[i] != 0)) {
				prod *= array[i];
			}
		}
		if (prod == 1) {
			prod = 0;
		}
		System.out.println("Minimum element:" + min + " and its position:" + position);
		System.out.println("Product of all even numbers:" + prod);
	}

}