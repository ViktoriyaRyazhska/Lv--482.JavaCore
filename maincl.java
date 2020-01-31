import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class maincl {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter two numbers");
		String w = reader.readLine();
		String n = reader.readLine();
		int a = Integer.parseInt(w);
		int b = Integer.parseInt(n);
		System.out.println("a+b=" + (a+b));
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);

	}

}
