package fifthHWpart2;

import java.io.BufferedReader;
import java.io.IOException;

public class SalariedEmployee extends Employee implements Calculate {

	private String socialSecurityNumber;
	private String name;
	private String surname;
	private double hourlyrate;
	private double numberofhoursworked;
	private double salary;

	SalariedEmployee() {
		this.socialSecurityNumber = " ";
		this.name = " ";
		this.surname = " ";
		this.hourlyrate = 0.0;
		this.numberofhoursworked = 0.0;
		this.salary = 0.0;
		employeeid++;
	}

	@Override
	public void calculatePay() {
		this.salary = this.hourlyrate * this.numberofhoursworked;
	}

	public void input(BufferedReader br) throws IOException {

		System.out.println("\nPlease enter socialSecurityNumber : ");
		this.socialSecurityNumber = br.readLine();
		System.out.println("\nPlease enter name : ");
		this.name = br.readLine();
		System.out.println("\nPlease enter surname : ");
		this.surname = br.readLine();
		System.out.println("\nPlease enter hourlyrate : ");
		this.hourlyrate = Integer.parseInt(br.readLine());
		System.out.println("\nPlease enter numberofhoursworked : ");
		this.numberofhoursworked = Integer.parseInt(br.readLine());

	}

	@Override
	public String toString() {
		return "Employee ID is : " + this.employeeid + "name is : " + name + "average monthly wage is : " + this.salary;
	}

}
