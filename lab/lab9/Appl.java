
package Practice9;

class MyException extends Exception {
	public MyException(String msg) {
		super(msg);
	}
}

public class Appl {
	public static void main(String[] args) {
		try {
		
		squareRectangle(-1,4);
		
		}catch(MyException s) {
			System.err.println(s.getMessage());
		}
		
		System.out.println("test");
	}

	static int squareRectangle(int a, int b) throws MyException {
		if (a < 0) {
			throw new MyException("first value < 0");
		} else if (b < 0) {
			throw new MyException("second value <0");
		} else {
			return 2 * a * b;
		}

	}
}
