package FourthHW;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Car {
	int year;
	int capacity;

	Car() {
		this.year = 0;
		this.capacity = 0;
	}

	public void input(Car[] c, BufferedReader br) throws IOException {
		for (int i = 0; i < c.length; i++) {
			System.out.println("Please enter year ");
			c[i].year = Integer.parseInt(br.readLine());
			System.out.println("Please enter capacity ");
			c[i].capacity = Integer.parseInt(br.readLine());
		}

	}

	public void sortYearbiggest(Car[] c, BufferedReader br, Car temp) {
		for (int i = 0; i < c.length; i++) {
			for (int j = i + 1; j < c.length; j++) {
				if (c[i].year < c[j].year) {
					temp = c[i];
					c[i] = c[j];
					c[j] = temp;

				}
			}
		}
		for (int i = 0; i < c.length; i++) {
			System.out.println("Sorted biggest is : " + c[i]);
		}

	}

	public void sortYearleast(Car[] c, BufferedReader br, Car temp) {
		for (int i = 0; i < c.length; i++) {
			for (int j = i + 1; j < c.length; j++) {
				if (c[i].year > c[j].year) {
					temp = c[i];
					c[i] = c[j];
					c[j] = temp;

				}
			}
		}
		for (int i = 0; i < c.length; i++) {
			System.out.println("Sorted least is : " + c[i]);
		}

	}

	@Override
	public String toString() {
		return "year is : " + this.year + " " + "capacity is : " + this.capacity;
	}

}
