package Practice8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {
	public static void main(String[] args) {

		String[] names = new String[4];
		// names[0] = {Orest21__2100};
//		for(int i = 0; i<names.length;)
		String name = "Orest21__2100";
		String name1 = "M";
		String name2 = "Mahfshahfa________";
		String name3 = "oRest";
		String name4 = "ORest";
		matc(name);
		matc(name1);
		matc(name2);
		matc(name3);
		matc(name4);

	}

	static void matc(String name) {
		String pattern = "[A-Z]{1}[a-z]{3,15}[0-9_]+";
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(name);

		if (m.matches()) {
			System.out.print("Matches the entire text string");
		}
		m.reset();
		System.out.println();

		while (m.find()) {
			System.out.print(name.substring(m.start(), m.end()));
		}

	}

	static void matcinput(String[] names) {
		for (int i = 0; i < names.length; i++) {
			//names[i]=br.readLine();
			
		}
	}
}
