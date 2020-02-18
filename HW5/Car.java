package HW5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Car {
	private String type;
	private int yearOfProduction;
	private double engineCapacity;

	public Car() {
		
	}
	public Car(String type, int yeraOfProduction, double engineCapacity) {
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getYearOfProduction() {
		return yearOfProduction;
	}

	public void setYearOfProduction(int yearOfProduction) {
		this.yearOfProduction = yearOfProduction;
	}

	public double getEngineCapacity() {
		return engineCapacity;
	}

	public void setEngineCapacity(double engineCapacity) {
		this.engineCapacity = engineCapacity;
	}

	@Override
	public String toString() {
		return "Car [type=" + type + ", yearOfProduction=" + yearOfProduction + ", engineCapacity=" + engineCapacity
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(engineCapacity);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result + yearOfProduction;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (Double.doubleToLongBits(engineCapacity) != Double.doubleToLongBits(other.engineCapacity))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		if (yearOfProduction != other.yearOfProduction)
			return false;
		return true;
	}

	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	public void input(BufferedReader reader) throws IOException {
		System.out.println("Enter the type (model) of car:");
		type = reader.readLine();
		System.out.println("Enter the year of car production:");
		yearOfProduction = Integer.parseInt(reader.readLine());
		System.out.println("Enter the engine capacity of car:");
		engineCapacity = Double.parseDouble(reader.readLine());
	}

	public void output() {
		System.out.println("Model of car: " + type + ", year of production: " + yearOfProduction + ", engine capacity: "
				+ engineCapacity);
	}

}
