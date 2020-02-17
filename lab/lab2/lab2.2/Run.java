
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Run {
	public static void main(String [] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int massnumber = 0;
		massnumber=Integer.parseInt(br.readLine());
		int x[] = new int[massnumber];
		int number;
		int counter=0;
		number=Integer.parseInt(br.readLine());
		for(int i =0; i<3;i++) {
			System.out.println("Enter numbers");
			x[i]=Integer.parseInt(br.readLine());
		}
		
		for(int i=0;i<3;i++) {
			if(x[i]%number==1) {
				counter++;
			}
		}
		System.out.println(counter);
		
		int day;
		System.out.println("Enter numbers");
		day=Integer.parseInt(br.readLine());
			
		
	switch(day) {
	case 1:
		System.out.println("Monday");
		break;
	case 2:
		System.out.println("Tusday");
		break;
	case 3:
		System.out.println("Wednesday");
		break;
	case 4:
		System.out.println("Thursday");
		break;
	case 5:
		System.out.println("Friday");
		break;
	case 6:
		System.out.println("Saturday");
		break;
	case 7:
		System.out.println("Sunday");
		break;
	default:
		System.out.println("Wrongggg");
	
	}
	}
	
	
	
	
}
	

