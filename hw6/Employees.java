package hw6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Employees {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		Employee[] employees = new Employee[6];
		SalariedEmployee one = new SalariedEmployee();
		one.input(reader);
		one.calculatePay();
		SalariedEmployee two = new SalariedEmployee();
		two.input(reader);
		two.calculatePay();
		SalariedEmployee three = new SalariedEmployee();
		three.input(reader);
		three.calculatePay();
		ContractEmployee four = new ContractEmployee();
		four.input(reader);
		four.calculatePay();
		ContractEmployee five = new ContractEmployee();
		five.input(reader);
		five.calculatePay();
		ContractEmployee six = new ContractEmployee();
		six.input(reader);
		six.calculatePay();
		employees[0] = one;
		employees[1] = two;
		employees[2] = three;
		employees[3] = four;
		employees[4] = five;
		employees[5] = six;
		
		for (int i = 0; i < employees.length; i++) {
			System.out.println(employees[i]);
		}

	}

}
