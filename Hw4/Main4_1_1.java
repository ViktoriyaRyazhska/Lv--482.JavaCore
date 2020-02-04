import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main4_1_1 {

	public static void main(String[] args) throws IOException {
		// read 3 float numbers and check: are they all belong to the range [-5,5]; read
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Print 3 float numbers: ");
		float n1 = Float.parseFloat(br.readLine());
		float n2 = Float.parseFloat(br.readLine());
		float n3 = Float.parseFloat(br.readLine());

		if (n1 >= -5 & n1 <= 5) {
			System.out.println(n1 + "belong to the range [-5,5]");
		}
		if (n2 >= -5 & n2 <= 5) {
			System.out.println(n2 + "belong to the range [-5,5]");
		}
		if (n3 >= -5 & n3 <= 5) {
			System.out.println(n2 + "belong to the range [-5,5]");
		}
	}
}
