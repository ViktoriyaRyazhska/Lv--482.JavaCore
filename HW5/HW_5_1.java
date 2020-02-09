/*
 * Ask user to enter the number of month. 
 * Read the value and write the amount of days in this month 
 * (create array with amount days of each month).
 */

package hw_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HW_5_1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] arr = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		System.out.print("Enter number of month, please ");

		int number = Integer.parseInt(br.readLine());

		System.out.println("Month number " + number + " has " + arr[--number] + " days");

	}

}
