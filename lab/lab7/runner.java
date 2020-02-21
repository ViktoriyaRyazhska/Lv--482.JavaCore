package Practice7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class runner {
	public static void main(String[] args) {
		List<Integer> myCollections = new ArrayList<Integer>();
		List<Integer> newCollections = new ArrayList<Integer>();
		//asList

		Random rand = new Random();

		int arr[] = new int[10];

		for (int i = 0; i < 10; i++) {
			myCollections.add(rand.nextInt(30));
			arr[i]=rand.nextInt(10);
		}
		
		Iterator<Integer> it = myCollections.iterator();
		
		Integer tmp;
			while(it.hasNext()) {
				tmp =it.next();
				if(tmp>5) {
					newCollections.add(tmp);
				}
			}
			
			
			for (int i : newCollections) {
				System.out.println(i);
				
			}
		
		
		
//		for(int i = 0; i<10;i++) {
//			System.out.print(arr[i] + " ");
//			myCollections.add(arr[i]);
//		}


		//List.add();
		
		
//		myCollections = ;
		
		while (it.hasNext()) {
			//System.out.println((myCollections) it.next());
		}
	}

}
