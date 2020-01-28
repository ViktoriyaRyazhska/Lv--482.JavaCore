import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Call {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// country call rate per minute $
		double c1 = 0.5;
		double c2 = 1.5;
		double c3 = 2.5;

		System.out.println("Input time of call for 1 country");
		double t1 = Double.parseDouble(br.readLine());
		System.out.println("Input time of call for 2 country");
		double t2 = Double.parseDouble(br.readLine());
		System.out.println("Input time of call for 3 country");
		double t3 = Double.parseDouble(br.readLine());
		
		//calculating the cost of a call for each country
		double a1 = c1 * t1;
		double a2 = c2 * t2;
		double a3 = c3 * t3;
		double sum = a1 + a2 + a3;
		
		//Output of call calculations
		System.out.println("Call to contry 1 cost " + a1 + "$");
		System.out.println("Call to contry 2 cost " + a2 + "$");
		System.out.println("Call to contry 3 cost " + a3 + "$");
		System.out.println("Together for payment " + sum + "$");
	}
}
