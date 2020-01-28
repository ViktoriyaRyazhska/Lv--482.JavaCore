package hw1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task11 {

	public static void main(String[] args)throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 

	    System.out.println("Which country are you calling from 1?");
	    String c1 = br.readLine();
	    System.out.println("What was the duration of the call  (min) ?");
	    int t1 = Integer.parseInt(br.readLine());
	      

	    System.out.println("Which country are you calling from 2?");
	    String c2 = br.readLine();
	    System.out.println("What was the duration of the call (min) ?");
	    int t2 = Integer.parseInt(br.readLine());
	    
	    System.out.println("Which country are you calling from 3?");
	    String c3 = br.readLine();
	    System.out.println("What was the duration of the call (min) ?");
	    int t3 = Integer.parseInt(br.readLine());
	    
	   int p1 = 2;
	   int p2 = 1;
	    int p3 = 4;
	    
	    int q1=t1*p1;
	    int q2=t2*p2;
	    int q3=t3*p3;
	    
	    System.out.println("Your price to the call from "+c1+ " =" +q1+ "$");
	    System.out.println("Your price to the call from "+c2+ " =" +q2+ "$");
	    System.out.println("Your price to the call from "+c3+ " =" +q3+ "$");
	    
	    int tp = q1+q2+q3;
	    
	    System.out.println("Total price = "+ tp);
	    
	    
}
}