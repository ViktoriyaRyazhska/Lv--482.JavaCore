package dz1_1;

import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		
		java.util.Scanner scan = new java.util.Scanner(System.in);

	int r;
	double P;
	double S;
	double n=3.141592;
	System.out.println("Vvedit radius");
		r= scan.nextInt();//
	System.out.println("r="+r);
		S= n * r * r; 
	System.out.println("S~"+S);
		P= 2 * n * r;
	System.out.println("P="+P);
	}
}
