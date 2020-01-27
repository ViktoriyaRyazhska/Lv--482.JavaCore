package FirstHW;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Hwp3 {
	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int timec1,timec2,timec3,together,price1,price2,price3,result1,result2,result3;
		System.out.println("Enter price for units per minute");
		price1=Integer.parseInt(br.readLine());
		price2=Integer.parseInt(br.readLine());
		price3=Integer.parseInt(br.readLine());
		System.out.println("Enter a tolk time");
		timec1=Integer.parseInt(br.readLine());
		timec2=Integer.parseInt(br.readLine());
		timec3=Integer.parseInt(br.readLine());
		result1=price1*timec1;
		result2=price2*timec2;
		result3=price3*timec3;
		together=result1+result2+result3;
		System.out.println("Separetly price:"+"\n"+"is:"+result1+"\n"+"is:"+result2+"\n"+"is:"+result3+"\n");
		System.out.println("together for payment :"+together+"\n");	
	}
}
