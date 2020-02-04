package ThirdHW;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class HWP2 {
	public static void main(String[]args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int numeric= 0;
		int max=Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		numeric=Integer.parseInt(br.readLine());
		int [] inumbers=new int [numeric];
		for (int i=0; i<numeric; i++) {
			inumbers[i]=Integer.parseInt(br.readLine());
		}
		for(int i=0; i<numeric; i++) {
			if(inumbers[i]>max) {
				max=inumbers[i];
			}
		}
		for(int i=0;i<numeric;i++) {
			if(inumbers[i]<min) {
				min=inumbers[i];
			}
		}
		System.out.println("Max number is:" + max);
		System.out.println("Mix number is:" + min);
	}
	
	}


