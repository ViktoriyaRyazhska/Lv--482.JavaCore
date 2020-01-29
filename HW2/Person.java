import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.*; 

public class Person {

	private String name;
	private int birthYear;
	private int age;
		
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
	
	public int getYear(){
		return getYear();
	}
	
	public String input(String name) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String a = reader.readLine();
		return name = a;
	}
	
	public int input(int birthYear) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int b = Integer.parseInt(reader.readLine());
		return birthYear = b;
	}
	
	public int age(int birthYear) {
		return age = getYear() - birthYear;
	}
	
	public void output(){
		System.out.println("Name of Person: " + name + ", age: " + age);
	}
	
	public void changeName(String name) {
		this.name = name;
	}
}

	