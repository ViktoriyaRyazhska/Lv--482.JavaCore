package practis5;

public class main {

	public static void main(String[] args) {
		Animal[] Animal = new Animal[2];
		Animal[0] = new cat();
		Animal[1] = new dog();

		for (int i = 0; i < Animal.length; i++) {
			Animal[i].voice();
			Animal[i].feed();
		}
	}

}
