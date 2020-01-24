import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class task1 {

	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	
	double pi = 3.14;
	double perimeter;
	double area;
	
	System.out.println("Enter the radius of flower bed:");
	
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	String s = reader.readLine();
	double radius = Double.parseDouble(s);
	
	perimeter = 2*pi*radius;
	area = pi*(radius*radius);
	
	System.out.println("The perimeter of flower bed is: " + perimeter);
	System.out.println("The area of flower bed is: " + area);
	}

}
