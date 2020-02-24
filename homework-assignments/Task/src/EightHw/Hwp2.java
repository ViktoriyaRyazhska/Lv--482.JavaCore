package EightHw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class RangeException extends Exception{
	RangeException(String msg){
		super(msg);
	}
}

public class Hwp2 {
	public static void main(String[] args) throws NumberFormatException, IOException, RangeException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(readNumber(0,10,br));
		
	}

	static int readNumber(int start,int end,BufferedReader br) throws NumberFormatException, IOException, RangeException {
		System.out.println("Please enter integers within range" + start + end);
		while(true) {
			int value = Integer.parseInt(br.readLine());
			if(value>=start  && value<=end) {
				System.out.println(value);
			}else {
				throw new RangeException("RangeException");
			}
		}
		
	}
}
