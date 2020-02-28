//Print n random numbers on console using Java 8
//Print n random numbers on console using Java 8 in a sorted order
//Using Java 8 show the biggest number from n random numbers
//Show witch today is a day of a week
//Show a date of first Monday for current month
//Write a method for sorting list of Strings using Java 8

package Practice11;

import java.util.Random;

public class Applp1 {
	public static void main(String[] args) {

		Random random = new Random();
		random.ints(0,1000).limit(10).forEach(System.out::println);
	}

}
