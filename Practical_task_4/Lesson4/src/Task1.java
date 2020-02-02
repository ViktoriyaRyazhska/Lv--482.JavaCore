import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {
    static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int[] arr = new int[3];
        for (int i = 0; i <= 2; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        for (int j = 0; j <= 2; j++) {
            check(arr[j]);
        }
        System.out.println("count: " + count);


    }

    static void check(int a) {
        if (a % 2 == 0) {
            count++;
        }
    }
}
