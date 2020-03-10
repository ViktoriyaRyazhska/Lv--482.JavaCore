import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task6 {

	public void execute() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int countWords = 0;
		System.out.println("Enter the text: ");
		String text = reader.readLine();
		for(int i = 0; i < text.length()-1; i++)
        {
            if(text.charAt(i)==' ' && text.charAt(i+1)!=' ')
                countWords++;
        }
		 System.out.println("Total number of words in string are: "+ (countWords+1));
	}
	
}


