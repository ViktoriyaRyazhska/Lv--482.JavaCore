package hw3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Dog {

	private String name;
	private Breed breed;
	private int age;
	
	public Dog() {
	}
	
	public Dog(String name, Breed breed, int age){
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

	public Breed getBreed() {
		return breed;
	}

	public void setBreed(Breed breed) {
		this.breed = breed;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	/*@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dog other = (Dog) obj;
		if (name != other.name)
			return false;
		if (breed != other.breed)
			return false;
		if (age != other.age)
			return false;
		return true;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		return result;
	}*/
	
	public void input(BufferedReader reader) throws IOException{
		System.out.println("input name of the dog:");
		name = reader.readLine();
		System.out.println("input breed of the dog:");
		breed = Breed.valueOf(reader.readLine());
		System.out.println("input age of the dog:");
		age = Integer.parseInt(reader.readLine());
		}
	
	public Dog checkSameDogs(Dog p) {
		return this.getName().equals(p.getName()) ? this : p;
	}
	
	public Dog oldestDog(Dog r) {
		return this.getAge() > r.getAge() ? this : r;
	}
	
	public void output() {
		System.out.println("Name of dog: " + name);
		System.out.println("Breed of dog: " + breed);
		System.out.println("Age of dog: " + age);
	}
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		Dog dog1 = new Dog();
		dog1.input(reader);
				
		Dog dog2 = new Dog();
		dog2.input(reader);
	
		Dog dog3 = new Dog();
		dog3.input(reader);
				
		Dog d = dog3.checkSameDogs(dog2.checkSameDogs(dog1));
		Dog e = dog3.oldestDog(dog2.oldestDog(dog1));
		System.out.println("There are two dogs with the same name" + dog1.checkSameDogs(dog2.checkSameDogs(dog3)));
		e.output();
		
		/*dog1.equals(dog2.equals(dog3));
		dog1.hashCode() == dog2.hashCode();*/
	}

}
