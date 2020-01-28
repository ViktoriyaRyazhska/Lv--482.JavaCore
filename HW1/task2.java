import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class task2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
	System.out.println("What is your name?");
	String name = reader.readLine();
	
	System.out.println("Where are you live, " + name + "?");
	String adress = reader.readLine();
	
	System.out.println("I live in " + adress + ".");
	}

}
