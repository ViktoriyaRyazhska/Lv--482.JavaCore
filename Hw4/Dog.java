package Hw4;

import java.io.BufferedReader;
import java.io.IOException;


public class Dog {
	private String name;
	String breed;
	private int age;

	public Dog() {
	}

	public Dog(String name, String breed, int age) {
		this.name = name;
		this.breed = breed;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void input(BufferedReader reader) throws IOException{
		System.out.println("input name of the dog:");
		name = reader.readLine();
		System.out.println("input breed of the dog:");
		breed = String.valueOf(reader.readLine());
		System.out.println("input age of the dog:");
		age = Integer.parseInt(reader.readLine());
		}
}
