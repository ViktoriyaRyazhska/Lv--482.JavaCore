package Practice8;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class lab2 {
	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		String name = br.readLine();
		
		String name = "Ivanov Petro Vasyl";
		
		String[] n = name.split(" ");
		
		System.out.println(n[0] + " " + n[1].charAt(0));//Orest M R
		
		System.out.println(n[1]);//Orest
		
		System.out.println(name);

	}
}
