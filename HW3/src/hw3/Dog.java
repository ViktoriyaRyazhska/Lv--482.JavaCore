package hw3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Dog {

	private String name;
	private String breed;
	private int age;
	
	public Dog() {
	}
	
	public Dog(String name, String breed, int age){
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
		breed = reader.readLine();

		/* ÍÅ ÇÍÀÞ, ÄÅ Â ÊÎÄ² ÐÎÇÌ²ÑÒÈÒÈ ÖÞ ÏÅÐÅÂ²ÐÊÓ ² ßÊ
		switch (input.toUpperCase()) {
		case "AKITA": 
			dog = Dog.AKITA; break;
		case "BULLDOG": 
			dog = Dog.BULLDOG; break;
		case "TERRIER":
			dog = Dog.TERRIER; break;
		case "SHEPHERD":
			dog = Dog.SHEPHERD; break;
		case "COLLIE":
			dog = Dog.COLLIE; break;
		default:
			System.out.println("No this breed! Write one of them: AKITA, BULLDOG, TERRIER, SHEPHERD, COLLIE");
			System.out.println("input breed of the dog:");
			breed = reader.readLine();*/
			
		System.out.println("input age of the dog:");
		age = Integer.parseInt(reader.readLine());
		}
	
	public Dog checkSameDogs(Dog p) {
		return this.getName().equals(p.getName()) ? this : p;
		//ÍÅ ÇÍÀÞ, ßÊÈÌ ×ÈÍÎÌ ÏÎÂÅÐÍÓÒÈ ÒÅÊÑÒ ÏÐÎ ÒÅ, ×È ª ÎÄÍÀÊÎÂ² ²ÌÅÍÀ
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
		d.output();
		e.output();
	}

}
