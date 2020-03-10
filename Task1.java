package edu5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {

    public static void execute() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n1=1, n2=1, n3, i, count;
        count = Integer.parseInt(br.readLine());
            System.out.print(n1 + " ");
            System.out.print(n2 + " ");
            for(i=2; i<count; ++i) {
                n3 = n1 + n2;
                System.out.print(n3 + " ");
                n1 = n2;
                n2 = n3;
            }
        System.out.println();
        }
}

