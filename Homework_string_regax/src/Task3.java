import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        String pattern = "\\$(\\d*)(\\.\\d{2})";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(s);
        while(m.find()){
            System.out.println(s.substring(m.start(), m.end()) + " ");
        }
    }
}
