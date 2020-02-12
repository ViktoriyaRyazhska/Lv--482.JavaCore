package HW1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.Math;

public class Flower {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Entre radius: ");
		double r = Double.parseDouble(br.readLine());
		double S = Math.PI * r * r;
		double P = 2 * Math.PI * r;
		System.out.println("P= " + P);
		System.out.println("S= " + S);
	}
}
