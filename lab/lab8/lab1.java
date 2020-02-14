package Practice8;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InterruptedIOException;

public class lab1 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = "IT";
		String str1 = "IT Academy";
		
		System.out.print(str1.contains(str));
	}

}
