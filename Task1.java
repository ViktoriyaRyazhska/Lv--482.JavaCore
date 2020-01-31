import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {

	static int k = 0;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(reader.readLine());
		int b = Integer.parseInt(reader.readLine());
		int c = Integer.parseInt(reader.readLine());
		
		check(a);
		check(b);
		check(c);
		System.out.println(k);
		

		if (a % 2 != 0) {
			k++;
		}
		if (b % 2 != 0)
			k++;
		if (c % 2 != 0)
			k++;
		System.out.println(5);

		if ((a % 2 != 0) && (b % 2 != 0) && (c % 2 != 0)) {
			System.out.println("Quantity of add numbers: 3");
		} else if (((a % 2 != 0) && (b % 2 != 0) && (c % 2 == 0)) || ((a % 2 != 0) && (b % 2 == 0) && (c % 2 != 0))
				|| ((a % 2 == 0) && (b % 2 != 0) && (c % 2 != 0))) {
			System.out.println("Quantity of add numbers: 2");
		} else if (((a % 2 != 0) && (b % 2 == 0) && (c % 2 == 0)) || ((a % 2 == 0) && (b % 2 != 0) && (c % 2 == 0))
				|| ((a % 2 == 0) && (b % 2 == 0) && (c % 2 != 0))) {
			System.out.println("Quantity of add numbers: 1");
		} else {
			System.out.println("Quantity of add numbers: 0");
		}
	}
	
	static void check(int x) {
		if (x % 2 != 0) {
			k++;
		}
	}

}
