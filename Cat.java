
public class Cat implements Animal {
	
	private String name;
	
	public Cat() {
			}
	
	public Cat(String name) {
		this.name = name;
	}

	public void voice() {
		System.out.println("The cat can say meow.");
	}

	public void feed() {
		System.out.println("The cat must to drink milk.");
	}
}
