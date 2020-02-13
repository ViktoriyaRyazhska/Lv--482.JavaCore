
public class Dog implements Animal {

	private String name;

	public Dog() {
	}

	public Dog(String name) {
		this.name = name;
	}

	public void voice() {
		System.out.println("The dog can say bark.");
	}

	public void feed() {
		System.out.println("The dog must to eat meat.");
	}
}
