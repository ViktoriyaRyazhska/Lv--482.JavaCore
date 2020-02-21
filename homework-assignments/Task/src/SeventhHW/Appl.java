package SeventhHW;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Appl {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		list.add(new Student("Ivan", 7));
		list.add(new Student("Petro", 1));
		list.add(new Student("Oleg", 2));
		list.add(new Student("Orest", 3));
		list.add(new Student("Andriy", 4));

//		printList(list);

		Student tmp = new Student();
		tmp.printStudents(list, 1);

		
		  Iterator it = list.iterator();
		  
		  list.sort(new Comparablecourse());
		  
		  printList(list);
		  
		  list.sort(new Comparablename());
		  
		  printList(list);
		 
	}

	static void printList(List list) {
		for (Object obj : list) {
			System.out.println(obj);
		}
		System.out.println("\n");
	}

}
