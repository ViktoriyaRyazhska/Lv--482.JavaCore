package dz3;

import java.io.BufferedReader;
import java.io.IOException;
import static dz3.Breed.*;

public class Dog {
    private String name;
    private int age;
    String breed;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Dog() {
    }

    public Dog(String name,String breed , int age) {
        this.name = name;

        this.age = age;
    }


    public void input( BufferedReader reader) throws IOException{
        System.out.println("Print name ");
        name=reader.readLine();
        System.out.println("Print breed");
        breed =reader.readLine();
        System.out.println("print age");
        age=reader.read();

    }

}


