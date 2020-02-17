/*
 * Implement a pattern for US currency: the first symbol "$", 
 * then any number of digits, dot and two digits after the dot. 
*/

package hw_7;

import java.util.Scanner;

public class HW_7_3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter text, please");
		String text = scanner.nextLine();
		scanner.close();

		int nUSD;
		int textLength = text.length();

		do {
			nUSD = text.indexOf('$');
			int j = 0;

			for (int i = nUSD; i < textLength; i++) {
				if (text.charAt(i + 1) >= '0' & text.charAt(i + 1) <= '9') {
					j++;
					continue;
				} else {
					System.out.print(text.substring(nUSD, nUSD + j + 1));
					break;
				}
			}
			if (text.charAt(nUSD + j + 1) != '.') {
				System.out.println(".00");
			}
			if (text.charAt(nUSD + j + 1) == '.' & text.charAt(nUSD + j + 2)>= '0' 
				& text.charAt(nUSD + j + 2)<= '9' & text.charAt(nUSD + j + 3)>= '0'  & text.charAt(nUSD + j + 3)<= '9') {
				System.out.println("."+text.substring(nUSD+j+2, nUSD + j + 4));
			}
			if (text.charAt(nUSD + j + 1) == '.' & text.charAt(nUSD + j + 2)>= '0' 
					& text.charAt(nUSD + j + 2)<= '9' & text.charAt(nUSD + j + 3)>= 'a'  & text.charAt(nUSD + j + 3)<= 'z') {
					System.out.println("."+text.substring(nUSD+j+2, nUSD + j + 3)+"0");
				}
			text = text.substring(nUSD + 1, textLength);
			textLength = textLength - nUSD - 1;

			if (text.indexOf('$') < 0) {
				break;
			}
			;
		} while (!text.isEmpty());

	}

}
