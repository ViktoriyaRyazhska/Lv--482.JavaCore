package FirstHW;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Hwp2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String name,address;
		System.out.println("Please enter your name");
		name=br.readLine();
		System.out.println("Please enter your address");
		address=br.readLine();
		System.out.println("Your name is:"+name+"\n"+"Your address is:"+address+"\n");
		}

}



