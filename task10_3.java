import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class task10_3 {

	static int max = 0;
	static int min = 0;
	static int k, l;

	public static void main(String[] args) {
		String fileName = "C:\\Users\\vbondtc\\Lv--482.JavaCore\\mytext.txt";
		FileReader fr = null;
		BufferedReader br = null;
		List<String> list = new ArrayList();
		try {
			fr = new FileReader(fileName);
			br = new BufferedReader(fr);
			String s = null;
			int count = 0;

			System.out.println("Read data from file: " + fileName);
			while ((s = br.readLine()) != null) {
				list.add(s);
				int length = s.length();
				System.out.println("row " + ++count + " read:" + s);
				System.out.println("The lentgh of row: " + length);
			}
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).length() > max) {
				max = list.get(i).length();
				k = i;
				if (list.get(i).length() < min) {
					min = list.get(i).length();
					l = i;
				}

			}

		}
		System.out.println("The longest row is row " + k + ", it's length: " + max);
		System.out.println("The shortest row is row " + l + ", it's length: " + min);
		
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).contains("Thailand")) {
				System.out.println(list.get(i));
			}
		}
	}
}
