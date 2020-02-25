//Prepare mytext.txt file with a lot of text inside.
//Read context from file into array of strings.
//Each array item contains one line from file.
//Complete next tasks:
//   1) count and write the number of symbols in every line.
//   2) find the longest and the shortest line. 
//   3) find and write only that lines, which consist of word «var»

package Practice10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class appl3 {
	public static void main(String[] args) throws IOException {

		List<String> arr = new ArrayList<>();

//		FileInputStream fis;

		String fileName = "file.txt";

//		fis = new FileInputStream(FaleName);

		FileReader fr = new FileReader(fileName);

		BufferedReader br = new BufferedReader(fr);

		String s = null;
		System.out.println("Read data from file: " + fileName);
		while ((s = br.readLine()) != null) {
			arr.add(s);
		}

		fr.close();

		for (Object obj : arr) {
			System.out.println(obj);
		}

		for (String obj : arr) {
			System.out.println(obj.length());
		}

		// System.out.println(temp);

		String str = "var";

		for (String obj : arr) {
			if (obj.contains(str)) {
				System.out.println(obj);
			}
		}
	}
}
