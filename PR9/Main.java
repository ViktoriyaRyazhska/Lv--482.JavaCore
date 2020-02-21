import java.io.BufferedReader;
import java.io.InputStreamReader;

class MyException extends Exception {
	public MyException(String msg) {
		super(msg);
	}
}

public class Main {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println(squareRectangle(5, 4));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Program not faling ");
	}

	static int squareRectangle(int a, int b) throws MyException {
		if (a < 0) {
			throw new MyException("a<0");
		} else if (b < 0) {
			throw new MyException("b<0");
		} else {
			return 2 * a * b;
		}
	}
}
