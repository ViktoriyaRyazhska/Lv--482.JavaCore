package edu;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Person Person1 = new Person("Oleg", "Olegovich");
		Person1.setBirthYear(1998);
		Person Person2 = new Person("Ivan", "Ivanovich");
		Person2.setBirthYear(1999);
		Person Person3 = new Person("Igor", "Igorovich");
		Person3.setBirthYear(2000);
		Person Person4 = new Person();
		Person4.setBirthYear(2005);
		Person4.setFirstName("Dmytro");
		Person4.setLastName("Dmytrovich");
		Person Person5 = new Person("Roman", "Romanovich");
		Person5.setBirthYear(2002);
		Person1.input();
		Person2.input();
		Person3.input();
		Person4.input();
		Person5.input();
		Person1.output();
		Person2.output();
		Person3.output();
		Person4.output();
		Person5.output();

	}

}
