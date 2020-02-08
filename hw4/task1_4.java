package hw4;

import java.util.Scanner;

public class task1_4 {

	public static void main(String[] args) {
		int[] year = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		Scanner sc = new Scanner(System.in);
		int i = 0;
		while (i < year.length) {
			System.out.println("Input number of month:");
			int n = Integer.parseInt(sc.nextLine());
			if ((n > 0) && (n <= 12)) {
				i = n - 1;
				System.out.println(year[i]);
				break;
				}
			
		}
		
		sc.close();
	}

}
