package fifthHWpart2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Runnerpart2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Employee e = new SalariedEmployee();

		Employee[] employee = new Employee[2];

		employee[0] = new SalariedEmployee();

		employee[1] = new ContractEmployee();

		((SalariedEmployee) employee[0]).input(br);
		((SalariedEmployee) employee[0]).calculatePay();
		((ContractEmployee) employee[1]).input(br);
		((ContractEmployee) employee[1]).calculatePay();
		

		for (int i = 0; i < employee.length; i++) {
			System.out.println(employee[i]);

		}

	}

}
