package edu5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3 {
	public static void execute() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double grn;
		double dollar;
		double change;
		int i;
		System.out.println("Input cost of dollar");
		dollar = Double.parseDouble(br.readLine());
		System.out.println("Input sum of money in gryvna");
		grn = Double.parseDouble(br.readLine());
		i = (int) ( grn/dollar);
		change = grn - i*dollar;
		System.out.println("You can buy " + Math.floor(i) + " dollars"+" Ostacha"+ change+" grn");
		

	}

}
