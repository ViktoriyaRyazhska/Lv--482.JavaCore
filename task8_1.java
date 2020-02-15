import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task8_1 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the text:");
		String a = reader.readLine();
		System.out.println("Enter the text:");
		String b = reader.readLine();
		System.out.println(b.contains(a));

	}

}
