package HW8_3;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Application3 {
    public static void main(String[] args) throws IOException {
        String text;
        text = " Xiaomi note 8 - $156.00, Xiaomi  note 7 = $139,00;" +
                " Xiaomi Redmi  9 - $320.00; Xiaomi Redmi 6 - $129.50; Xiaomi mi 8 - $156,00.50";
        String pattern = "\\$(\\d*)(\\.\\d{2})";
        Pattern p = Pattern.compile(pattern);
        Matcher matcher = p.matcher(text);
        while (matcher.find()) {
            System.out.print(text.substring(matcher.start(), matcher.end()) + "*");
        }
    }
}