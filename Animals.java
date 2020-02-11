
public class Animals {

	public static void main(String[] args) {
		Animal[] animals = new Animal[4];
		animals[0] = new Cat("Vasya");
		animals[1] = new Dog("Murzik");
		animals[2] = new Cat("Murzik");
		animals[3] = new Dog("Vasya");
		for (int i = 0; i < animals.length; i++) {
			animals[i].voice();
			animals[i].feed();
			
		}
	}

}
