package hw6;

import java.io.BufferedReader;
import java.io.IOException;

public class ContractEmployee extends Employee implements Payment {
	
	private int federalTaxIdmember;
	private String name;
	private double averageMonthlySalary;
	private double fixedMonthlyPayment;
	
	public ContractEmployee() {
		}
	
	public ContractEmployee(int federalTaxIdmember, String name, double fixedMonthlyPayment) {
		this.federalTaxIdmember = federalTaxIdmember;
		this.name = name;
		this.fixedMonthlyPayment = fixedMonthlyPayment;
	}
	
	@Override
	public String toString() {
		return "ContractEmployee [federalTaxIdmember=" + federalTaxIdmember + ", name=" + name
				+ ", averageMonthlySalary=" + averageMonthlySalary + "]";
	}

	public void input(BufferedReader reader) throws IOException {
		System.out.println("Enter the name of the ContractEmployee:");
		name = reader.readLine();
		System.out.println("Enter the social security number of the ContractEmployee:");
		federalTaxIdmember = Integer.parseInt(reader.readLine());
		System.out.println("Enter the fixed monthly payment of the ContractEmployee:");
		fixedMonthlyPayment = Double.parseDouble(reader.readLine());
	}
		
		@Override
	public double calculatePay() {
			return averageMonthlySalary = fixedMonthlyPayment;
	}

}
