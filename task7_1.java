import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class task7_1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter ten numbers: ");
		List<Integer> myCollection = new ArrayList();
		List<Integer> newCollection = new ArrayList();
		for (int i = 0; i < 10; i++) {
			int a = Integer.parseInt(reader.readLine());
			myCollection.add(a);
			if (a > 5) {
				newCollection.add(i);
			}
		}
		for (Object print : myCollection) {
			System.out.print(print+" ");
		}
		System.out.println();
		for (Object print : newCollection) {
			System.out.print(print+" ");
		}
		for (int i = 0; i < myCollection.size(); i++) {
			if (myCollection.get(i) > 20)  {
				myCollection.remove(i);
				i--;
			}
		}
		System.out.println();
		for (Object print : myCollection) {
			System.out.print(print+" ");
		}
		System.out.println();
		check(1, myCollection, 2);
		check(-3, myCollection, 8);
		check(-4, myCollection, 5);

		
		for (Object print : myCollection) {
			System.out.print(print+" ");
		}
		Collections.sort(myCollection);
		System.out.println();
		for (Object print : myCollection) {
			System.out.print(print+" ");
		}
	}
	static void check(int n, List<Integer> list, int size) {
		if (list.size() > size) {
			list.add(n);
		}
	}
}
