import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Myproject {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// TODO Auto-generated method stub
		String Name, address;
		System.out.println("What is your name?");
		Name = br.readLine();
		System.out.println("Where do you live?");
		address = br.readLine();
		System.out.println("Name = "+ Name + " address - " + address);
	}

}
