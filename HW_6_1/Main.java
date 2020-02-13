package dz6_1;

public class Main {

    public static void main(String[] args) {
     Bird[] birds=new Bird[4];
     birds[0]=new Swallow();
     birds[1]= new Penguin();
     birds[2]=new Eagle();
     birds[3]=new Chiken();
     for (int i = 0; i<birds.length; i++){
         System.out.println("Can fly:"+ birds[i].fly());
     }
    }
}
