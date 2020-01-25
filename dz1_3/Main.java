package dz1_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int c1;
        int c2;
        int c3;
        int t1;
        int t2;
        int t3;
        int b1;
        int b2;
        int b3;
        int b4;

        System.out.println("Введіть кількість одиниць для країни с1 ");
             c1= Integer.parseInt(br.readLine());
        System.out.println("Введіть кількість одиниць для країни с2 ");
            c2= Integer.parseInt(br.readLine());
        System.out.println("Введіть кількість одиниць для країни с3 ");
            c3= Integer.parseInt(br.readLine());
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println("Введіть час для t1");
            t1=Integer.parseInt(br.readLine());
        System.out.println("Введіть час для t2");
            t2=Integer.parseInt(br.readLine());
        System.out.println("Введіть час для t3");
            t3=Integer.parseInt(br.readLine());
            b1=c1*t1;
        System.out.println(b1);
            b2=c2*t2;
        System.out.println(b2);
            b3=c3*t3;
        System.out.println(b3);
            b4=b1+b2+b3;
        System.out.println(b4);
    }
}
