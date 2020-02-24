
package EightHw;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Hwp1 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Please enter first number");

			double one = Double.parseDouble(br.readLine());

			System.out.println("Please enter second number");

			double second = Double.parseDouble(br.readLine());

			System.out.println(div(one, second));

		} catch (IOException ioe) {
			System.err.println("IOException!");
			ioe.printStackTrace();
			// ioe.getMessage();
		} catch (ArithmeticException are) {
			System.err.println("ArithmeticException!");
			are.printStackTrace();
		} catch (NumberFormatException npe) {
			System.err.println("NumberFormatException!");
			npe.printStackTrace();
		}

	}

	static double div(double number, double number1) {
		if (number != 0.0 && number1 != 0.0) {
			return number / number1;
		} else {
			throw new ArithmeticException();
		}
	}
}
