

import java.io.IOException;

public class Cesar implements Algorithms{
	private static int offset = 3;

	public void decryption(String s) throws IOException {
		offset = 26 - 3;
		encryption(s);
	}

	public void encryption(String s) throws IOException{
		offset = offset % 26 + 26;
		StringBuilder encryption1 = new StringBuilder();
		for (char i : s.toCharArray()) {
			if (Character.isLetter(i)) {
				if (Character.isUpperCase(i)) {
					encryption1.append((char) ('A' + (i - 'A' + offset) % 26));
				} else {
					encryption1.append((char) ('a' + (i - 'a' + offset) % 26));
				}
			} else {
				encryption1.append(i);
			}
			}
		System.out.println(encryption1.toString());
	}

}
