import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the day of the week (from 1 to 7): ");
		int a = Integer.parseInt(reader.readLine());
switch (a) {
case 1:
	System.out.println("Monday lunedi ��������");
	break;
case 2:
	System.out.println("Tuesday martedi �������");
	break;
case 3:
	System.out.println("Wednesday mercoledi ������");
	break;
case 4:
	System.out.println("Thursday giovedi ������");
	break;
case 5:
	System.out.println("Friday venerdi �'������");
	break;
case 6:
	System.out.println("Saturday sabato ������");
	break;
case 7:
	System.out.println("Sunday domenica �����");
	break;
default:
	System.out.println("Wrong!");
}
	}

}
