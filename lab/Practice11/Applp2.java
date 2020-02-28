package Practice11;

import java.util.Random;

public class Applp2 {
	public static void main(String[] args) {
		Random random = new Random();
		random.ints(0,1000).limit(10).sorted().forEach(System.out::println);
	}
}
