/*
 * Create class Car with fields type, year of production and engine capacity. 
 * Create and initialize four instances of class Car. 
 * Display cars certain model year  (enter year in the console);
    ordered by the field year.
 */

package hw_5;

import java.util.Scanner;

class Car {

	private String typeCar;
	private int yearProduction;
	private double engineCapacity;

	public Car(String typeCar, int yearProduction, double engineCapacity) {
		this.typeCar = typeCar;
		this.yearProduction = yearProduction;
		this.engineCapacity = engineCapacity;
	}

	public String getTypeCar() {
		return typeCar;
	}

	public void setTypeCar(String typeCar) {
		this.typeCar = typeCar;
	}

	public int getYearProduction() {
		return yearProduction;
	}

	public void setYearProduction(int yearProduction) {
		this.yearProduction = yearProduction;
	}

	public double getEngineCapacity() {
		return engineCapacity;
	}

	public void setEngineCapacity(double engineCapacity) {
		this.engineCapacity = engineCapacity;
	}

	@Override
	public String toString() {
		return "Car [typeCar=" + typeCar + ", yearProduction=" + yearProduction + ", engineCapacity=" + engineCapacity
				+ "]";
	}
}

public class HW_5_4 {

	public static void main(String[] args) {

		Car[] car = new Car[5];
		car[0] = new Car("Truck", 2018, 5.5);
		car[1] = new Car("Bus", 2019, 3.5);
		car[2] = new Car("Van", 2016, 2.5);
		car[3] = new Car("PickUp", 2017, 2.1);
		car[4] = new Car("Jeep", 2018, 3.2);

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter year of production: ");
		int year = sc.nextInt();
		sc.close();
		System.out.println(year + " car's are: ");
		for (Car currentCar : car) {
			if (currentCar.getYearProduction() == year) {
				System.out.println(currentCar);
			}
		}
		
		Car tmp;
		for (int i = 0; i < car.length - 1; i++) {
			for (int j = 0; j < car.length - 1 - i; j++) {
				if (car[j].getYearProduction() > car[j + 1].getYearProduction()) {
					tmp = car[j];
					car[j] = car[j + 1];
					car[j + 1] = tmp;
				}
			}
		}
		System.out.println("Sorted car Array by year of production");
		for (Car currentEmp : car) {
			System.out.println(currentEmp);
		}
	}
}
