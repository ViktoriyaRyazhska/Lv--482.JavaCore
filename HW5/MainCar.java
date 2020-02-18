package HW5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainCar {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		Car car1 = new Car();
		car1.input(reader);

		Car car2 = new Car();
		car2.input(reader);

		Car car3 = new Car();
		car3.input(reader);

		Car car4 = new Car();
		car4.input(reader);

		Car[] cars = new Car[4];
		cars[0] = car1;
		cars[1] = car2;
		cars[2] = car3;
		cars[3] = car4;

		System.out.println("Enter the year:");
		int d = Integer.parseInt(reader.readLine());
		for (int i = 0; i < cars.length; i++) {
			if (d == cars[i].getYearOfProduction()) {
				cars[i].output();
			}
		}
	}

}
