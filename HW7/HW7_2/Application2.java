package HW7_2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Application2 {
	public static void main(String[] args) {

		Map<String, String> personMap = new HashMap<String, String>();
		personMap.put("Staretskyi", "Anton");
		personMap.put("Sergijenko", "Oleksij");
		personMap.put("Melenevych", "Andrii");
		personMap.put("Partyka", "Orest");
		personMap.put("Kolodii", "Roman");
		personMap.put("Avramenko", "Olha");
		personMap.put("Moroz", "Anna");
		personMap.put("Levytska", "Anna");
		personMap.put("Kovalyk", "Petro");
		personMap.put("Gorovyi", "Ihor");

		System.out.println(personMap);
		System.out.println(isTheSameValues((HashMap<String, String>) personMap));
		deleteByValue((HashMap<String, String>) personMap, "Orest");
		System.out.println(personMap);

	}

	public static boolean isTheSameValues(HashMap<String, String> hashMap) {
		boolean isSame;
		HashMap<String, Integer> frequencies = new HashMap<>();
		for (String name : hashMap.values()) {
			frequencies.put(name, 0);
		}
		for (String name : hashMap.values()) {
			int currentValue = frequencies.get(name);
			frequencies.put(name, currentValue + 1);
			if (frequencies.get(name) > 1) {
				return true;
			}
		}
		return false;
	}

	public static void deleteByValue(HashMap<String, String> hashMap, String name) {
		Iterator iterator = hashMap.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry pair = (Map.Entry) iterator.next();
			if (pair.getValue().equals(name)) {
				iterator.remove();
			}
		}
	}
}