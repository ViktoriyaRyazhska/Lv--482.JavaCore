
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Start {
	public static void main(String[] args) throws IOException {
		String nameCountries;
		Continents co;
		System.out.println("Enter name of country");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		nameCountries=br.readLine();
		switch(nameCountries) {
		case "Ukraine": case "Poland":
			co=Continents.Europe;
			System.out.println(co);
			break;
		case "China": case"Tailand":
			co=Continents.Asia;
			System.out.println(co);
			break;
		default:
			System.out.println("Try again");
			
		}
		
		
		
	}
}
