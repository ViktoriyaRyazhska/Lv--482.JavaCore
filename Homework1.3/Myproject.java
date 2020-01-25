import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Myproject {
	public static double multiply(double cost,float time) {
		double result = cost * time;
		return result;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// TODO Auto-generated method stub
		System.out.println("Input cost for a minute for country - 1");
		double c1 = Double.parseDouble(br.readLine()); 
		System.out.println("Input cost for a minute for country - 2");
		double c2 = Double.parseDouble(br.readLine());
		System.out.println("Input cost for a minute for country - 3");
		double c3 = Double.parseDouble(br.readLine());
		System.out.println("Input the length of the first call");
		float t1 = Float.parseFloat(br.readLine());
		System.out.println("Input the length of the second call");
		float t2 = Float.parseFloat(br.readLine());
		System.out.println("Input the length of the third call");
		float t3 = Float.parseFloat(br.readLine());
		double fullcost1 = multiply(c1,t1);
		System.out.println("cost of call 1 - " + fullcost1);
		double fullcost2 = multiply(c2,t2);
		System.out.println("cost of call 2 - " + fullcost2);
		double fullcost3 = multiply(c3,t3);
		System.out.println("cost of call 3 - " + fullcost3);
		double fullcost = fullcost1 + fullcost2 + fullcost3;
		System.out.println("fullcost of 3 calls - " + fullcost);
	}

}
