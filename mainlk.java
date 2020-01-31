import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class mainlk {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("How are you?");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String answer = reader.readLine();
		System.out.println("You are " + answer);
	}

}
