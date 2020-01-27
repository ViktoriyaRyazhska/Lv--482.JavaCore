package FirstHW;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Hwp3 {
	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String Country1,Country2,Country3;
		int timec1,timec2,timec3,together;
		System.out.println("Enter Countrys");
		Country1=br.readLine();
		Country2=br.readLine();
		Country3=br.readLine();
		System.out.println("Enter time speeking");
		timec1=Integer.parseInt(br.readLine());
		timec2=Integer.parseInt(br.readLine());
		timec3=Integer.parseInt(br.readLine());
		together=timec1+timec2+timec3;
		System.out.println("Separetly time:"+"\n"+Country1+"is:"+timec1+"\n"+Country2+"is:"+timec2+"\n"+Country3+"is:"+timec3+"\n");
		System.out.println("Time together:"+together+"\n");	
	}
}
