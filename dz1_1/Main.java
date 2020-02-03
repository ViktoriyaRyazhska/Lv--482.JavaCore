package dz1_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        float m;
        float p;
        float y;
        System.out.println("Enter the m");
        m = br.read();
        System.out.println("Enter the p");
        p = br.read();
        System.out.println("Enter the y");
        y = br.read();

        for () {
            if (m >= -5 && m <= 5)
                System.out.println(m);

        } if (p >= -5 && p <= 5) {
            System.out.println(p);
        }
        if (y >= -5 && y <= 5) {
            System.out.println(y);

        } else {
            System.out.println("Something wrong");

        }
    }
}