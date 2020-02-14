import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task8_3 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		for (int i = 0; i < 5; i++) {
			
			System.out.println("Enter the name" + (i+1) + ":");
			String a = reader.readLine();
			match(a);
		}

	}
	
	
	static void match(String str) {
		String pattern = "[a-zA-Z_0-9]{3,15}";
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(str);
		System.out.println(m.matches());
		
	}

}
