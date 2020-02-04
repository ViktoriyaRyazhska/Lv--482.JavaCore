package Practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class p3 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int numeric=0;
		int counterplus = 0;
		int counterminus = 0;
		System.out.print("Please enter numeric array");
		numeric = Integer.parseInt(br.readLine());
		int [] arr = new int[numeric];
		System.out.print("Please enter values in array");
		for(int i =0; i<arr.length;i++) {
			arr[i]=Integer.parseInt(br.readLine());
		}
		for(int i=0; i<arr.length;i++) {
			if(arr[i]>=0) {
				counterplus++;
			}
			else {
				counterminus++;
			}
		}
		
		System.out.println("Possitive numbers :" + counterplus + "\n" + "Negative numbers" + counterminus + "\n");
		
		if(counterplus>counterminus) {
			System.out.print("Counterplus biggest");
		}
		else {
			System.out.print("Counterminus biggest");
		}
		
	}

}
