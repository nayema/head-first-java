package com.nayema;

public class Main {

    public static void main(String[] args) {
        Dog one = new Dog();
        one.setSize(70);

        Dog two = new Dog();
        two.setSize(20);

        Dog three = new Dog();
        three.setSize(2);

        System.out.println("Dog one: " + one.getSize());
        System.out.println("Dog two: " + two.getSize());
        System.out.println("Dog three: " + three.getSize());

        one.bark();
        two.bark();
        three.bark();
    }
}
