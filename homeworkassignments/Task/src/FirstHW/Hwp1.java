package FirstHW;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Hwp1 {
	public static void main(String[] args) throws IOException {
		while (true){
		double radious,perimeter,area;
		int c;
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please enter radious");
		radious=Double.parseDouble(br.readLine());
		System.out.println("enter '1' to calculate the perimeter  or '2' to calculate the area or '3' to calculate perimeter and radious");
		c = Integer.parseInt(br.readLine());
		if(c==1) {
			perimeter=2*Math.PI*radious;
			System.out.println("radious is:"+perimeter+"\n");
		}
		else if(c==2) {
			area=Math.PI*Math.pow(radious,2);
			System.out.println("area is:"+area+"\n");
		}
		else if(c==3) {
			perimeter=2*Math.PI*radious;
			area=Math.PI*Math.pow(radious,2);
			System.out.println("area is:"+area+"\n"+"perimeter is:"+perimeter+"\n");
		}
		else {
			System.out.println("Try again");
		}
		}
		
	}
	

}
