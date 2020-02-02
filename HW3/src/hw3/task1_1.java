package hw3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task1_1 {

static float k = 0;
	
	static void check(float x) {
		if (x >= -5 && x <= 5) {
			k++;
		}
	}

		public static void main(String[] args) throws NumberFormatException, IOException  {
		
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the three numbers:");
		float a = Float.parseFloat(reader.readLine());
		float b = Float.parseFloat(reader.readLine());
		float c = Float.parseFloat(reader.readLine());
		
			check(a);
			check(b);
			check(c);
			System.out.println(k + " float numbers belonge to the rage [-5,5].");
			
		
	}

}
