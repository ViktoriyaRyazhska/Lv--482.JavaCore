package lab7;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Appl {

	public static void main(String[] args) {
		 List<Integer> list = new ArrayList();
		 List<Integer> list1 = new ArrayList();
		 list.add(1);
		 list.add(2);
		 list.add(10);
		 list.add(55);
		 list.add(3);
		 list.add(6);
		 list.add(17);
		 list.add(22);
		 list.add(5);
		 list.add(9);
		 System.out.println(list);
		 //for (Integer item : list) {
			// if (item >5) {
			//	 list1.add(item);
			// }
			
		//}
		 //System.out.println(list1);
		// for (Integer item : list) {
		//	 if (item >20) {
		//		 list.remove(item);
		//	 }
			
		//}
		 for (int i = 0; i < list.size(); i++) {
			 if (list.get(i) >20) {
				 list.remove(list.get(i));
			 }			
		}
		 
		 System.out.println(list);
		 System.out.println(list.size());
		 list.add(2,1);
		 list.add(5,-4);
		 list.add(8,-3);
		 System.out.println(list);
		 Collections.sort(list);
		 System.out.println(list);
		 
         
	}

}
