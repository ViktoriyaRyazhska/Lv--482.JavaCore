import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class myproj {

	public static void main(String[] args) throws NumberFormatException, IOException {
		double pi = 3.14;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// TODO Auto-generated method stub
		System.out.println("Input radius");
		double radius = Double.parseDouble(br.readLine());
		double area = pi*radius*radius;
		double perimetre = 2 * pi * radius;
		System.out.println("area - " + area);
		System.out.println("perimetre - " + perimetre);
	}

}
