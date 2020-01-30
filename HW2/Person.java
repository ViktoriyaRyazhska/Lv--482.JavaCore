import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Person {

	private String name;
	private int birthYear;
		
	public Person(){
		
	}
	
	public Person(String name, int birthYear){
		this.name = name;
		this.birthYear = birthYear;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	
	public void input(BufferedReader reader) throws IOException{
		System.out.println("input name: ");
		name = reader.readLine();
		System.out.println("input birthYear: ");
		birthYear = Integer.parseInt(reader.readLine());
		}
	
	public int age() {
		return 2020 - birthYear;
	}
	
	public void output(){
		System.out.println("Name of Person: " + name + ", age: " + age());
	}
	
	public void changeName(String name) {
		this.name = name;
	}
}

	