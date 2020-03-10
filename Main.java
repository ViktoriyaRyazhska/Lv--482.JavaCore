import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			System.out.println("Please enter number Task");
			int value = Integer.parseInt(br.readLine());
			switch (value) {
			case 1:
				// Task1.execute();
				break;
			case 2:
				// some info
				//Task2.execute();
				break;
			case 3:
				// some info
				// Task3.execute();
				break;
			case 4:
				//Prints a number of loud numbers
				Task4.execute("My test text");
				break;
			case 5:
				// some info
				// Task5.execute();
				break;
			case 6:
				// some info
				//Task6.execute();
				break;
			case 7:
				//Prints factorial
				Task7.execute(5);
				break;
			case 8:
				// some info
				//Task8.execute();
				break;
			case 9:
				// some info
				//Task9.execute();
				break;
			case 10:
				// some info
				//Task10.execute();
				break;
			case 11:
				// some info
				//Task11.execute();
				break;
			case 12:
				//Prints the sum of all the multiples of 3 or 5 below 100
				Task12.execute(100);
				break;
			case 13:
				// some info
				//Task13.execute();
				break;
			case 14:
				// some info
				//Task14.execute();
				break;
			case 0:
				System.exit(0);
			}
		}
	}
}
