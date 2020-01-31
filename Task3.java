import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3 {

	public enum Continent {
		EUROPE, ASIA, AFRICA, SOUTHAMERICA, NORTHAMERICA, OCEANIA
	}
	

	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the name of the country:");
		String a = reader.readLine();
		
		Continent continent=Continent.AFRICA;
		
		switch (a) {
		case "Italy": case "Germany": case "France": case "Ukraine": case "Poland":
			continent = Continent.EUROPE; break;
		case "Pakistan": case "China": case "Korea": case "Israel": case "Catar":
			continent = Continent.ASIA; break;
		case "Cameroon": case "Nigeria": case "Mali": case "Ghana": case "South Africa":
			continent = Continent.AFRICA; break;
		case "Brasil": case "Argentina": case "Uruguay": case "Chile": case "Peru":
			continent = Continent.SOUTHAMERICA; break;
		case "USA": case "Canada": case "Mexico": case "Panama": case "Cuba":
			continent = Continent.NORTHAMERICA; break;
		case "Australia": case "New Zealand": case "Samoa": case "Fiji": case "Tonga":
			continent = Continent.OCEANIA; break;
		default:
			System.out.println("No this country!");
			System.exit(0);
		}
		System.out.println(continent);
	}

}
