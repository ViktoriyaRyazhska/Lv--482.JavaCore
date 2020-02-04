package edu2;

import java.util.ArrayList;

public class Appl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog1 = new Dog(breed.Haski, 12, "Bars");
		Dog dog2 = new Dog(breed.Shepherd, 8, "Jessie");
		Dog dog3 = new Dog(breed.Labrador, 9, "Bars");
		ArrayList<Dog> dogs = new ArrayList<>();
        dogs.add(dog1);
        dogs.add(dog2);
        dogs.add(dog3);
        int same = 0;
        outerloop:
        for (Dog dog : dogs) {
        	int pos = dogs.indexOf(dog);
        	for(Dog doggy : dogs)
        	{	
        		if (dogs.indexOf(doggy) == pos) {
        		}
        		else {
        			if (doggy.getName() == dog.getName()) {
        				System.out.println("there are 2 dogs with the same name");
        				same = 1;
        				break outerloop;
        			}
        		}
        	}
        }
        if (same == 0) {
        	System.out.println("there is no two dogs with the same name");
        }
        int oldest = 0;
        for (Dog dog : dogs) {
        	if (dog.getAge() > oldest) {
        		oldest = dog.getAge();
        	}
        }
        for(Dog dog : dogs) {
        	if (dog.getAge() == oldest) {
        		System.out.println(dog.getMybreed() + " " + dog.getName() + "-is the oldest dog");
        	}
        }
	}

}
