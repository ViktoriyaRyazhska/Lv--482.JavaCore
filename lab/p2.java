package Practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class p2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int numeric=0;
		int sumPossitive=0;
		System.out.print("Please enter numeric array");
		numeric = Integer.parseInt(br.readLine());
		int [] arr = new int[numeric];
		System.out.print("Please enter values in array");
		for(int i =0; i<arr.length;i++) {
			arr[i]=Integer.parseInt(br.readLine());
		}
		for(int i = 0;i<arr.length;i++) {
			if(arr[i]>=0) {
				sumPossitive += arr[i];
			}
		}
		System.out.print(sumPossitive);
	}

}
