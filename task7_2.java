import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class task7_2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Map<Integer, String> employeeMap = new HashMap();
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter seven ID and names: ");
		Integer in;
		String str;
		for (int i = 0; i < 7; i++) {
			in = Integer.parseInt(reader.readLine());
			str = reader.readLine();
			employeeMap.put(in, str);
		}
		for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
		    System.out.println(entry.getKey() + " " + entry.getValue());
		}
		System.out.println("Enter ID: ");
		int a = Integer.parseInt(reader.readLine());
		if (employeeMap.containsKey(a)) {
			System.out.println(employeeMap.get(a));
		}
		else System.out.println("There is wrong ID!");
		System.out.println("Enter the name: ");
		String name = reader.readLine();
	for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
		if (entry.getValue().equals(name)) {
			System.out.println(entry.getKey());	
		}
	}
}
}
