package m_maksymiv;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class appl {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<car> list = new ArrayList<>();
		car c = new car();
		while (true) {

			String action;
			System.out.println("Please enter action");
			action = br.readLine();

			switch (action.toLowerCase()) {
			case "push":
				System.out.println("Enter new car");
				if (list.size() <= c.getPlace()) {
					list.add(new car());
					for (car obj : list) {
						System.out.println("your number parking is :" + obj.getCounter());
					}
				} else {
					System.out.println("There are no free place, please wait !");
				}
				break;
			case "showall":
				for (car obj : list) {
					System.out.println(obj.getCounter());
				}
			case "exit":
				System.exit(0);
			case "recipt":
				while (true) {
					System.out.println("enter  \n1)your parking number \n2)stay in the parking(in hours)  for geting recipt");
					int temp = Integer.parseInt(br.readLine());
					if (list.size() >= temp) {
						int hourTemp=Integer.parseInt(br.readLine());
						list.get(temp).setHour(hourTemp);
						System.out.println(list.get(temp).countPrice() +"$" + "\nGood bye");
						break;
					} else {
						System.out.println("Try again");
					}
				}

			}

		}
	}
}
