package ThirdHW;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class HWP4 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Breed breead=null;
		System.out.println("Please enter breed dog");
		breead=Breed.valueOf(br.readLine());
		Dog temp = new Dog();
		Dog d = new Dog("Loran",breead,20);
		Dog d2 = new Dog();
		Dog d3 = new Dog();
		
		d2.Input(br);
		d3.Input(br);

		temp = d.olddog(d2.olddog(d3));	
	
		System.out.println("The oldest dog" + "\n" + temp.Output());
		
		temp = (d.sameName(d2.sameName((d3))));
		
		System.out.print("Same names :" + "\n" + temp);
	}

}
