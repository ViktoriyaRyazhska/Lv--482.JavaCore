package Hw4;

import java.io.BufferedReader;
import java.io.IOException;

public class Dog {
	private String name;
	private Breed breed;
	private int age;

	public Dog() {
	}

	public Dog(String name, Breed breed, int age) {
		this.name = name;
		this.breed = breed;
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBreed(Breed breed) {
		this.breed = breed;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Breed getBreed() {
		return this.breed;
	}

	public String getName() {
		return this.name;
	}

	public int getAge() {
		return this.age;
	}

	public void input(BufferedReader reader) throws IOException {
		System.out.println("input name of the dog:");
		name = reader.readLine();
		System.out.println("input breed of the dog:");
		breed = Breed.valueOf(reader.readLine());
		System.out.println("input age of the dog:");
		age = Integer.parseInt(reader.readLine());
	}

	public String Output() {
		return this.name + "" + this.breed + "" + this.age;
	}

	public Dog olddog(Dog d) {
		return this.age > d.age ? this : d;
	}

	public Dog sameName(Dog d) {
		return this.name.equals(d.name) ? this : d;
	}

	@Override
	public String toString() {
		return "name is :" + " " + this.name + " " + "breed is :" + " " + this.breed + " " + "age is :" + " "
				+ this.age;
	}
}
