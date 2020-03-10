import java.util.Random;

public final class Task8 {
    private int numberOfDigits;
    private static Random random = new Random();
    private int digit;
    private static int counter = 0;
    static int[] arr;

    public static int execute(int numberOfDigits) {
        arr = new int[numberOfDigits];
        for (int i = 0; i < numberOfDigits; i++) {

            arr[i] = random.nextInt(2);
            if (arr[i] == 1){
                counter++;
            }
            System.out.print(arr[i]);

        }
        System.out.println();
        System.out.println("counter: " + counter);
        return counter;

    }

}
