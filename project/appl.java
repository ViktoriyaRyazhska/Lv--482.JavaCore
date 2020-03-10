package project;

//Europe tour

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class appl {
	public static void main(String[] args) throws IOException, ClassNotFoundException {

		Random rand = new Random();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<shopper> list = new LinkedList<>();
		List<Company> list1 = new LinkedList<>();
		FileOutputStream fileOutputStream = new FileOutputStream("tempFile");
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

		int value = 0;

		while (true) {
			System.out.println("Please enter value");
			value = Integer.parseInt(br.readLine());
			switch (value) {
			case 1:
				System.out.println("All allows company");
				for (Company obj : list1) {
					System.out.println(list1);
				}
				list.add(new shopper().input(br));
				for (shopper obj : list) {
					objectOutputStream.writeObject(obj);
				}
				break;
			case 2:
				if (list1.size() > 0) {
					list.sort(new ComporatorAge());
					for (shopper obj : list) {
						System.out.println(obj);
					}
				} else {
					System.out.println("We dont have any traveler company");
				}
				break;
			case 3:
				System.out.println(list.size());
				System.out.println("Please enter id shopper to delete it");
				int temp = Integer.parseInt(br.readLine());
				if (temp < list.size()) {
					list.remove(temp);
					System.out.println("Success");
				} else {
					System.out.println("Try again");
				}
				break;
			case 4:
				System.out.println("Please enter id shopper to change it");
				int temp1 = Integer.parseInt(br.readLine());
				if (temp1 < list.size()) {
					list.remove(temp1);
					list.add(new shopper().input(br));
					System.out.println("Success");
				} else {
					System.out.println("Try again");
				}
				break;
			case 5:
				System.out.println("Creating new company... ");
				list1.add(new Company().input(br));
				System.out.println("Company created... ");
				break;
//			case 6:
//				FileInputStream fileInputStream = new FileInputStream("tempFile");
//				ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
//				shopper uknown = (shopper) objectInputStream.readObject();
//				System.out.println(uknown);
//				break;
			case 0:
				System.exit(0);
				objectOutputStream.close();
			default:
				System.out.println("Try again");
				break;
			}

		}

	}

}
