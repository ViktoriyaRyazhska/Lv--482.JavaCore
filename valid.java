package prc83;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class valid {
	public static void main(String[] args) {
		
		String [] name = {"Maksy09253","Madadadara","Kolomoka","AK","dsvsdsd446ydfgfeu54hhg56456y4gge4675r"};
		
		for ( int i=0; i<name.length; i++) {
			 System.out.println(name[i] + " " + check(name[i])) ;
			
		}
		
		
		
	}

	public static boolean check(String n) {
		Pattern p = Pattern.compile("^[A-Za-z0-9_-]{3,15}$");
		Matcher m  = p.matcher(n);
		
		return m.matches();
	}
	
	
}
