import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task9 {
	
	int a, b;
	
	public int squareRectangle (BufferedReader reader) throws MyException {
		System.out.println("Enter two numbers:");
		try {
			a = Integer.parseInt(reader.readLine());
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		} 
		
		try {
			b = Integer.parseInt(reader.readLine());
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		} 
		
		if (a > 0 && b > 0) {
			return a * b;
		}
		else
			throw new MyException("Please enter positive number!");
		}
		
	
	
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		task9 c = new task9();
		try {
			System.out.println(c.squareRectangle(reader));
		} catch (MyException e) {
			e.printStackTrace();
		}

	}

}
