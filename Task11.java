package lesson_13.task_11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*- Task 11
 * 	Enter the credit card number from Visa, MasterCard, AmericanExpress, Discover) 
 *  Check for the correct number (see how credit cards use the checksum)
 */
public class Task11 {
	    //public static void main(String[] args) throws IOException {
		 public void execute() throws IOException {

		List<Card_Brand> cardBrand = new ArrayList<Card_Brand>();
		cardBrand.add(new Card_Brand("Visa", "1111"));
		cardBrand.add(new Card_Brand("MasterCard", "2222"));
		cardBrand.add(new Card_Brand("AmericanExpress", "3333"));
		cardBrand.add(new Card_Brand("Discover", "4444"));

//		System.out.println("List of Card_Brand : ");
//		for (Card_Brand currentCard_Brand : cardBrand) {
//			System.out.println(currentCard_Brand);
//		}

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Card_Brand, please");
		String inputBrand = br.readLine();
		System.out.println("Enter Card_Number, please");
		String inputNumber = br.readLine();
		int count = 0;
		for (Card_Brand currentCard_Brand : cardBrand) {
			if (currentCard_Brand.getBrandName().equals(inputBrand)) {
				if (inputNumber.startsWith(currentCard_Brand.getBrandMask())) {
					System.out.println("True brand");
				} else {
					System.out.println("False brand");
				}
				count++;
			}
		}
		if (count == 0) {
			System.out.println("There is no such brand");
		}

	}
}

class Card_Brand {
	private String brandName;
	private String brandMask;

	public Card_Brand(String brandName, String brandMask) {
		this.brandName = brandName;
		this.brandMask = brandMask;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getBrandMask() {
		return brandMask;
	}

	public void setBrandMask(String brandMask) {
		this.brandMask = brandMask;
	}

	@Override
	public String toString() {
		return "brandName = " + brandName + ", brandMask = " + brandMask;
	}

}
