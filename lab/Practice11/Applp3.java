package Practice11;

import java.util.Random;

public class Applp3 {
	public static void main(String[] args) {
		Random random = new Random();
			System.out.println(random.ints(0,1000000).limit(10).max());
		
	}
}
