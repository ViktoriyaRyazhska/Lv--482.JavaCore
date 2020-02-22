package hw7;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class task7_2 {

	public static void main(String[] args) {
		
		Map<String, String> personMap = new HashMap();
		
		personMap.put("Kravchuk", "Leonid");
		personMap.put("Kuchma", "Leonid");
		personMap.put("Yushenko", "Victor");
		personMap.put("Yanukovich", "Victor");
		personMap.put("Poroshenko", "Petro");
		personMap.put("Zelensky", "Volodymyr");
		personMap.put("Tymoshenko", "Yulia");
		personMap.put("Yaceniuk", "Arseniy");
		personMap.put("Turchinov", "Olexandr");
		personMap.put("Moroz", "Gennadiy");
		
		System.out.println("Original map:");
		for (Iterator<Entry<String, String>> i = personMap.entrySet().iterator(); i.hasNext();) {
			Map.Entry<String, String> entry = i.next();
			System.out.println("Last name = " + entry.getKey() + "   First name = " + entry.getValue());
		}
		
		System.out.println("-------------");
		System.out.println("Changed map:");
		for (Iterator<Map.Entry<String, String>> i = personMap.entrySet().iterator(); i.hasNext();) {
			Map.Entry<String, String> entry = i.next();
			if (entry.getValue().equals("Victor")) {
				i.remove();
			}
			}
		
		for (Iterator<Entry<String, String>> i = personMap.entrySet().iterator(); i.hasNext();) {
			Map.Entry<String, String> entry = i.next();
			System.out.println("Last name = " + entry.getKey() + "    First name = " + entry.getValue());
		}
	}
	}


