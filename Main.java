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
				// some info
				// Task4.execute();
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
				// some info
				//Task7.execute();
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
				// some info
				//Task12.execute();
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
