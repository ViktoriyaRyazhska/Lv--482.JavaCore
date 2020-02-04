package ThirdHW;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Dog {
	private String name;
	private Breed breed;
	private int age;
	
	public Dog() {
		
	}
	public Dog(String name,Breed breed,int age) {
		this.name=name;
		this.breed=breed;
		this.age=age;
	}
	
	public void SetName(String name) {
		this.name=name;
	}
	
	public void SetBreed(Breed breed) {
		this.breed=breed;
	}
	
	public void SetAge(int age) {
		this.age=age;
	}
	
	public String GetName() {
		return this.name;
	}
	
	public Breed GetBreed() {
		return this.breed;
	}
	
	public int GetAge() {
		return this.age;
	}
	
	public void Input(BufferedReader br) throws IOException {
		System.out.println("Please enter name,breed and age");
		this.name=br.readLine();
		//valueOf can convert to enum
		this.breed=Breed.valueOf((br.readLine()));
		this.age=Integer.parseInt(br.readLine());

	}
	
	public String Output() {
		return this.name + " " + this.breed + " " + this.age;
	}

	public Dog olddog(Dog d) {
		return this.age>d.age ? this : d;
		
	}
	
	//t f = f; t t= t?
	public Dog sameName(Dog d) {
		return this.name.equals(d.name) ? this : d;
	}
	
	@Override
	public String toString() {
		return "name is :" + " " + this.name + " "  + "breed is :" + " "  + this.breed + " " + "age is :" + " "  + this.age;
	}
}
