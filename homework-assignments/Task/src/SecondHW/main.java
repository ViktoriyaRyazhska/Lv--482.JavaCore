package SecondHW;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class main {
	public static void main(String [] args) throws IOException {
		String name,surname;
		int birthyear ;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please enter firstname,lastname and birthyear");
		Person[] p=new Person[2];
		for(int i =0;i<2;i++) {
			p[i] = new Person();
		}
		for(int i=0; i<2; i++) {
			name = br.readLine();
			surname = br.readLine();
			birthyear  = Integer.parseInt(br.readLine());
			p[i].Input(name,surname,birthyear );
		}
		for(int i =0;i<2;i++) {
			p[i].Output();
		}
		
		Person p3=new Person("Igon","Ivaniv");
		p3.setBirthyear(1998);
		p3.Output();
		
		Person p4=new Person();
		p4.SetfirstName("Anton");
		p4.SetlastName("Romanov");
		p4.setBirthyear(2008);
		System.out.println(p4.getAge(2008));
		
		Person p5=new Person();
		name = br.readLine();
		surname = br.readLine();
		birthyear = Integer.parseInt(br.readLine());
		p5.Input(name, surname, birthyear );
		p5.Output();
		p5.changeName("Andriy", "replace");
		p5.Output();
		
	}

}
