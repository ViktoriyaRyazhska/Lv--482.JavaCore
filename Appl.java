package lab8;

public class Appl {

	public static void main(String[] args) {
//		String s1 ="IT";
//		String s2= "IT Academy";
//System.out.println(s2.contains(s1));
		String name = "surname name patr";
//		String surname="asd";
//		String name ="qwe";
//		String patronymic = "rty";

		String[] n = name.split(" ");
		System.out.println(n[0] + " " + n[1].charAt(0) + " " + n[2].charAt(0));
		System.out.println(n[1]);
		System.out.println(n[1]+" "+ n[2]+" "+n[0]);

	}

}
