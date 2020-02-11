package FourthHW;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class sourse {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Car[] car = new Car[3];
		Car temp = new Car();

		for (int i = 0; i < car.length; i++) {
			car[i] = new Car();
		}

		temp.input(car, br);

		for (int i = 0; i < car.length; i++) {
			System.out.println(car[i] + "\n ");
		}

		temp.sortYearbiggest(car, br, temp);
		temp.sortYearleast(car, br, temp);
	}
}
