package hw3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task1_2 {

	public static int maxNumber(int x, int y) {
		return x > y ? x : y;
	}
	
	public static int minNumber(int x, int y) {
		return x < y ? x : y;
	}
		
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the three numbers:");
		int a = Integer.parseInt(reader.readLine());
		int b = Integer.parseInt(reader.readLine());
		int c = Integer.parseInt(reader.readLine());
		
		int p = maxNumber(a, maxNumber(b,c));
		System.out.println("Tne maximum number is " + p);
		
		int d = minNumber(a, minNumber(b,c));
		System.out.println("Tne minimum number is " + d);
	}

}