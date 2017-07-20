package com.nayema;

//Encapsulation

public class Dog {
    private int size;

    public int getSize() { //getter
        return size;
    }

    public void setSize(int s) { //setter
        this.size = s;
    }

    public void bark() {
        if(size > 60) {
            System.out.println("Woof! Woof!");
        } else if(size > 14) {
            System.out.println("Ruff! Ruff!");
        } else {
            System.out.println("Yip! Yip!");
        }
    }
}
