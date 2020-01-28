package hw1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task13 {

	public static void main(String[] args)throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
 System.out.println("Write radius circle");
 int r = Integer.parseInt(br.readLine());
 
 double pi = 3.14;
  double s = 2*pi*r;
  double p  = pi*r*r;
  
  System.out.println("area cicrle= "+p);
  System.out.println("perimeter circle= "+ s);
  

  
  
	
	    }
	}

	