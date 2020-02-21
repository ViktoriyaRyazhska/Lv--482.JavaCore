package HW6_2;

import java.io.BufferedReader;
import java.io.IOException;

public class SalariedEmployee extends Employee implements Calculate {
	private int socialSecurityNumber;
	private String name;
	private double averageMonthlySalary;
	private double hourlyRate;
	private double numberOfHoursWorked;

	public SalariedEmployee() {

	}

	public SalariedEmployee(int socialSecurityNumber, String name, double hourlyRate, double numberOfHoursWorked) {
		this.socialSecurityNumber = socialSecurityNumber;
		this.name = name;
		this.hourlyRate = hourlyRate;
		this.numberOfHoursWorked = numberOfHoursWorked;
	}

	@Override
	public String toString() {
		return "SalariedEmployee [socialSecurityNumber=" + socialSecurityNumber + ", name=" + name
				+ ", averageMonthlySalary=" + averageMonthlySalary + "]";
	}

	public void input(BufferedReader reader) throws IOException {
		System.out.println("Enter the name of the SalariedEmployee:");
		name = reader.readLine();
		System.out.println("Enter the social security number of the SalariedEmployee:");
		socialSecurityNumber = Integer.parseInt(reader.readLine());
		System.out.println("Enter the hourly rate of the SalariedEmployee:");
		hourlyRate = Double.parseDouble(reader.readLine());
		System.out.println("Enter the number of hours worked of the SalariedEmployee:");
		numberOfHoursWorked = Double.parseDouble(reader.readLine());
	}

	@Override
	public double calculatePay() {
		return averageMonthlySalary = hourlyRate * numberOfHoursWorked;
	}

}
