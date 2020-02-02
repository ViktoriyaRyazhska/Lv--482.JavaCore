import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String countryName = br.readLine();
        for (Asia a : Asia.values()) {
            if (countryName.equalsIgnoreCase(a.name())) {
                System.out.println("Asia");
            }
        }
        for (Australia a :Australia.values()) {
            if (countryName.equalsIgnoreCase(a.name())) {
                System.out.println("Australia");
            }
        }
        for (Europe a : Europe.values()) {
            if (countryName.equalsIgnoreCase(a.name())) {
                System.out.println("Europe");
            }
        }
        for (SouthAmerica a : SouthAmerica.values()) {
            if (countryName.equalsIgnoreCase(a.name())) {
                System.out.println("South America");
            }
        }
        for (NorthAmerica a : NorthAmerica.values()) {
            if (countryName.equalsIgnoreCase(a.name())) {
                System.out.println("North America");
            }
        }
        for (Africa a : Africa.values()) {
            if (countryName.equalsIgnoreCase(a.name())) {
                System.out.println("Africa");
            }
        }
        for (Antarctica a : Antarctica.values()) {
            if (countryName.equalsIgnoreCase(a.name())) {
                System.out.println("Antarctica");
            }
        }


//        switch (countryName.toUpperCase()){
//            case "RUSSIA":
//            case "CYPRUS":
//            case "JAPAN":
//                Asia russia = Asia.RUSSIA;
//                Asia.RUSSIA.writeCountry();
//                break;
//            case "TONGA":
//            case "FIJI":
//                Australia tonga = Australia.TONGA;
//                Australia.TONGA.writeCountry();
//                break;
//
//        }
    }
}
