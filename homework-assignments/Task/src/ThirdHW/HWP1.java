package ThirdHW;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class HWP1 {
	public static void main(String[]args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int numeric= 0;
		numeric=Integer.parseInt(br.readLine());
		float [] fnumbers=new float [numeric];
		for(int i=0; i<numeric; i++) {
			fnumbers[i]=Float.parseFloat(br.readLine());
		}
		for(int i=0; i<numeric; i++) {
			if(fnumbers[i]>=-5.0 && fnumbers[i]<=5.0) {
				System.out.println("number belong to the range [-5,5]" + fnumbers[i]);
			}
			else {
				System.out.println(" number not belong to the range [-5,5]" + fnumbers[i]);
			 }
		}

	}
}
