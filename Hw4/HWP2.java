package Hw4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HWP2 {

	public static void main(String[] args) throws IOException {
		//read 3 integer numbers and write max and min of them;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int max, min;
		System.out.println("Enter 3 integer numbers ");
		int a1 = Integer.parseInt(br.readLine());
		int a2 = Integer.parseInt(br.readLine());
		int a3 = Integer.parseInt(br.readLine());
		if (a1 > a2) {
			max = a1;
			min = a2;

		} else {
			max = a2;
			min = a1;
		}
		if (a3 > max) {
			max = a3;
		}
		if (a3 < min) {
			min = a3;
		}
		System.out.println("Max of numbres is: " + max);
		System.out.println("Min of numbers is: " + min);
	}

}
