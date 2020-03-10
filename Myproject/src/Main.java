import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static void Actions(Algorithms obj, BufferedReader br) throws IOException {
		boolean a = true;
		while (a == true) {
			System.out.println("Input 1 to encrypt; 2 to decrypt;3 to finish;"
					+ "4 to change an algorithm;");
			String answer1 = br.readLine();
			if (answer1.equalsIgnoreCase("1")) {
				obj.encryption(answer(br).toLowerCase());
			} else if (answer1.equalsIgnoreCase("2")) {
				obj.decryption(answer(br));
			} else if (answer1.equalsIgnoreCase("3")) {
				System.exit(0);
			} else if (answer1.equalsIgnoreCase("4")) {
				a = false;
			}
		}
	}

	static String answer(BufferedReader br) throws IOException {
		System.out.println("Input some text");
		String a = br.readLine();
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			while (true) {
				System.out.println("Enter type of crypter(1-(Cesar's),2(MORZE)");
				String answer = br.readLine();
				switch (answer) {
				case "1":
						Actions(new Cesar(), br);
						break;
				case "2":
						Actions(new Morze(), br);
						break;
				default:
					System.out.println("Not a valid number");
				}
			}
		} catch (Exception e) {
			System.out.println("Some Error occurred");

		}
	}
}
