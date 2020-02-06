package edu2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Car car1 = new Car("Sedan", 2002, 2.4f);
		Car car2 = new Car("Lorry", 1989, 1.9f);
		Car car3 = new Car("Cabriolet", 2015, 3.5f);
		Car car4 = new Car("Sedan", 2000, 2.6f);
		System.out.println("Input year of production");
		int myYear = Integer.parseInt(br.readLine());
		Car arr[] = new Car[4];
		arr[0] = car1;
		arr[1] = car2;
		arr[2] = car3;
		arr[3] = car4;
		String output = "";
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].getYearOfProduction() == myYear) {
				output += arr[i].toString() + "\n";
			}
		}
		System.out.println(output);
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 1 + i; j < arr.length; j++) {
				if (arr[i].getYearOfProduction() > arr[j].getYearOfProduction()) {
					int temp = arr[i].getYearOfProduction();
					arr[i].setYearOfProduction(arr[j].getYearOfProduction());
					arr[j].setYearOfProduction(temp);
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
