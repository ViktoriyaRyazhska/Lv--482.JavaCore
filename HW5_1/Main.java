package HW5_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        System.out.println("Введіть число місяця");
        int number = Integer.parseInt(br.readLine());
        System.out.println(" Місяць номер " + number + " має " + arr[--number] + " днів ");

    }
}
