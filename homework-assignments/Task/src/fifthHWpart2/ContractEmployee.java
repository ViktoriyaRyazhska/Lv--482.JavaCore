package fifthHWpart2;

import java.io.BufferedReader;
import java.io.IOException;

public class ContractEmployee extends Employee implements Calculate {

	private String name;
	private String surname;
	private int federalTaxIdmember;
	private int salary;
	private int fixedmonthlypayment;

	ContractEmployee() {
		this.name = "";
		this.surname = "";
		this.federalTaxIdmember = 0;
		this.salary = 0;
		this.fixedmonthlypayment = 0;
		employeeid++;
	}

	public void input(BufferedReader br) throws IOException {
		System.out.println("\nPlease enter name : ");
		this.name = br.readLine();
		System.out.println("\nPlease enter surname : ");
		this.surname = br.readLine();
		System.out.println("\nPlease enter federalRaxIdmember");
		this.federalTaxIdmember = Integer.parseInt(br.readLine());
		System.out.println("\nPlease enter fixedmounthlypayment");
		this.fixedmonthlypayment = Integer.parseInt(br.readLine());

	}

	@Override
	public void calculatePay() {
		salary = fixedmonthlypayment;

	}

	@Override
	public String toString() {
		return "Employee ID is : " + this.employeeid + "name is : " + name + "average monthly wage is : " + this.salary;
	}

}
