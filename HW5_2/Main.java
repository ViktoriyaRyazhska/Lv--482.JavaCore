package HW5_2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int sum = 0;
        int product = 1;
        int[] arr = new int[10];
        System.out.println("Enter array of 10 integer numbers: ");
        for (int i = 0; i < 10; i++) {
            arr[i] = s.nextInt();
        }
        int k = 0;
        for (int i = 0; i < 5; i++) {
            if (arr[i] >= 0) {
                sum += arr[i];
                k++;
            }
            else {
                break;
            }
        }
        if(k == 5) {
            System.out.println("Sum of five first positive numbers of array equals = " + sum);
        } else {
            for(int i = 5; i < 10; i++) {
                product *= arr[i];
            }
            System.out.println("Product of five last numbers of array equals = " + product);
        }
    }
}
