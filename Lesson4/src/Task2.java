import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String day = br.readLine();

        switch (day.toLowerCase()) {
            case "monday":
                System.out.println("monday понеділок");
                break;
            case "tuesday":
                System.out.println("tuesday вівторок");
                break;
            case "wednesday":
                System.out.println("wednesday середа");
                break;
            case "thursday":
                System.out.println("thursday четвер");
                break;
            case "friday":
                System.out.println("friday п'ятниця");
                break;
            case "sunday":
                System.out.println("sunday субота");
                break;
            case "saturday":
                System.out.println("saturday неділя");
                break;
            default:
                System.out.println("Wrong");
        }

    }
}
