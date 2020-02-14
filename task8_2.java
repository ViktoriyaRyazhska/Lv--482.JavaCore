import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task8_2 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the surname:");
		String a = reader.readLine();
		System.out.println("Enter the name:");
		String b = reader.readLine();
		System.out.println("Enter the patronymic:");
		String c = reader.readLine();
		System.out.println(a + " " + b.toUpperCase().charAt(0) + c.toUpperCase().charAt(0));
		System.out.println(b);
		System.out.println(b + " " + c + " " + a);
	}

}
