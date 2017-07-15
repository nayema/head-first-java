package com.nayema;

public class Main {

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.bark();
        dog1.name = "Bart";
        
        Dog[] myDogs = new Dog[3];

        myDogs[0] = new Dog();
        myDogs[1] = new Dog();
        myDogs[2] = dog1;

        myDogs[0].name = "Lisa";
        myDogs[1].name = "Marge";

        System.out.println("last dog's name is " + myDogs[2].name);

        for (int i = 0; i < myDogs.length; i=i+1) {
            myDogs[i].bark();
        }
    }
}
