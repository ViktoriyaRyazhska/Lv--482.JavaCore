import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Flower {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Entre radius: ");
		double r = Double.parseDouble(br.readLine());
		double Pi = 3.14;
		double S = Pi * r * r;
		double P = 2 * Pi * r;
		System.out.println("P= " + P);
		System.out.println("S= " + S);
	}
}
