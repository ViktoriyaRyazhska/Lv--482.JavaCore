/* write a method main(), that has to enter 10 numbers:
   a1, a2, ..., a10, such that 1 < a1 < ... < a10 < 100
*/

package hw_9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Range_Numbers_Ext {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int range_Start = 1;
		int range_End = 100;
		int[] arr = new int[10];

		System.out.println("Enter ten integer numbers belong to the range [1 : 100]");
		int i = 0;
		int k;
		do {
			try {
				k = Integer.parseInt(br.readLine());
				if (k < range_Start | k > range_End) {
					System.out.println(k + " doesn't belong to the range [1 : 100]");
					System.out.println("continue entering, please");
					continue;
				}

				else {
					arr[i] = k;
					i++;
				}

			} catch (NumberFormatException e) {
				System.err.println("non-format input");
				e.printStackTrace();
			} catch (IOException e) {
				System.err.println("sth goes wrong");
				e.printStackTrace();
			}

		} while (arr[9] == 0);

		for (int j = 0; j <= 9; j++) {
			System.out.print(arr[j] + " ");
		}
	}

}
