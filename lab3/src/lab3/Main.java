package lab3;

import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;
        import java.time.DayOfWeek;
        import static lab3.Continent.*;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


	/*	int a =1;
		int b=2;
		int c=3;
		int i=0;
		if (a %2 !=0) {
			i++;
		}if(b %2 !=0) {
			i++;
		} if(c %2 !=0) {
			i++;
	}

		System.out.println("i= "+i);*/

	/*int day;

	System.out.println("Vvedit day");

	day=Integer.parseInt(br.readLine());

		switch(day){

		case 1:
			System.out.println("Monday , ��������");
			break;
		case 2:
			System.out.println("³������,Tuesday");
			break;
		case 3:
			System.out.println("Wednesday , ������");
			break;
		case 4:
			System.out.println("Thoursday , ������");
			break;
		case 5:
			System.out.println("Friday , �������");
			break;
		case 6:
			System.out.println("Saturday , ������");
			break;
		case 7:
			System.out.println("Sunday , �����");
			break;
			default:
				System.out.println("Something Wrong!");
				break;
		}System.out.println(day);*/
        String Country;
        System.out.println("Write your country");
Country=br.readLine();
        switch(Country) {
            case"Ukraine":case"Germany":case "Poland":case "Belarus":
                System.out.println("Your continent is" + Europe );
                System.out.println(" Your country is "+Country);
                break;
            case "Asia":
                System.out.println("Your continent is" + Asia);
               System.out.println(" Your country is Asia");
                break;
            case "North_America":
                System.out.println("Your continent is" + North_Amerika);
                System.out.println(" Your country is North_Amerika");
                break;
            case "South_Amerika":
                System.out.println("Your continent is" + South_Amerika);
                System.out.println(" Your country is South_Amerika");
                break;
                case "Australia":
                System.out.println("Your continent is" + Australia);
                System.out.println(" Your country is Australia");
                break;
                case "Afrika":
                System.out.println("Your continent is" + Afrika);
                System.out.println(" Your country is Afrika");
                break;
        }



    }
}

