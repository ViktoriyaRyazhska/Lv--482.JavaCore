package HomeWork;

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
      int a1;
      int a2;
      int a3;
      int a4;
        System.out.println("Введіть кількість одиниць для країни c1");
        c1=Integer.parseInt(br.readLine());
        System.out.println("Введіть кількість одиниць для країни c2");
        c2=Integer.parseInt(br.readLine());
        System.out.println("Введіть кількість одиниць для країни c3");
        c3=Integer.parseInt(br.readLine());
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println("Введіть час для t1");
        t1= Integer.parseInt(br.readLine());
        System.out.println("Введіть час для t2");
        t2= Integer.parseInt(br.readLine());
        System.out.println("Введіть час для t3");
        t3= Integer.parseInt(br.readLine());
        a1=c1*t1;
        System.out.println(a1);
        a2=c2*t2;
        System.out.println(a2);
        a3=c3*t3;
        System.out.println(a3);
        a4=a1+a2+a3;
        System.out.println(a4);




    }
}
