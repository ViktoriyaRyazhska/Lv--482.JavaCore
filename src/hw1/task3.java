package hw1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class task3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
				
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the three different standard units:");
		
		double c1 = Double.parseDouble(reader.readLine());
		double c2 = Double.parseDouble(reader.readLine());
		double c3 = Double.parseDouble(reader.readLine());
		
		System.out.println("Enter the three different times of call (in minutes):");
		
		double t1 = Double.parseDouble(reader.readLine());
		double t2 = Double.parseDouble(reader.readLine());
		double t3 = Double.parseDouble(reader.readLine());
		
		double pay1 = c1*t1;
		double pay2 = c2*t2;
		double pay3 = c3*t3;
		double payAll = pay1 + pay2 + pay3;
		
		System.out.println("It is necessary to pay for the first call: " + pay1);
		System.out.println("It is necessary to pay for the second call: " + pay2);
		System.out.println("It is necessary to pay for the third call: " + pay3);
		System.out.println("It is necessary to pay for the all calls: " + payAll);

	}

}
