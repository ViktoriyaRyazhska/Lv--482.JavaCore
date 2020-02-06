package edu2;

public class Car {
	private String type;
	private int yearOfProduction;
	private float engine_capacity;
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
	public float getEngine_capacity() {
		return engine_capacity;
	}
	public void setEngine_capacity(float engine_capacity) {
		this.engine_capacity = engine_capacity;
	}
	public Car(String type, int year, float capacity) {
		this.type = type;
		this.yearOfProduction = year;
		this.engine_capacity = capacity;
	}
	@Override
	public String toString() {
		return "Car [type=" + type + ", yearOfProduction=" + yearOfProduction + ", engine_capacity=" + engine_capacity
				+ "]";
	}

}
