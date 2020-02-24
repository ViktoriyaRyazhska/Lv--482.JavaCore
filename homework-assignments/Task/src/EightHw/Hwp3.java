package EightHw;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Hwp3 {
	public static void main(String[] args) throws NumberFormatException, IOException, RangeException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int arr[] = new int[10];

		final int min = 1;
		final int max = 100;

		for (int i = 0; i < arr.length; i++) {
			int counter = 0;
			arr[i] = Integer.parseInt(br.readLine());
			if (arr[i] >= min && arr[i] <= 100) {
				counter++;
				if (counter == 9) {
					break;
				}

			} else {
				throw new RangeException("RangeException");
			}

		}
		for(int i =0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}

	}
}
