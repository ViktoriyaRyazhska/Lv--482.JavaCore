package dz1_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

        public class Main {

            public static void main(String[] args) throws IOException {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                int r;
                double P;
                double S;
                double Y=3.141592;
                System.out.println("Vvedit` radius kola");
              r = Integer.parseInt(br.readLine());
                System.out.println(r);
                S=Y*r*r;
                System.out.println("S~"+S);
                P=2*Y*r;
                System.out.println("P~"+P);
            }
    }

