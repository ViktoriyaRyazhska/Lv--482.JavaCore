package lab6;

public class Appl {

	public static void main(String[] args) {
		Animal[] an = new Animal[4];
		an[0] = new Cat();
		an[1] = new Dog();
		an[2]= new Cat();
		an[3] = new Dog();
		
		for (int i = 0; i < an.length; i++) {
			an[i].Feed();
			an[i].Voice();
		}
	}

}
