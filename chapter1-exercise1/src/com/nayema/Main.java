package com.nayema;

public class Main {
    public static void main(String[] args) {
        int beerNum = 99;
        String word = "bottles";

        while (beerNum > 0) {

            System.out.println(beerNum + " " + word + " of beer on the wall.");
            System.out.println(beerNum + " " + word + " of beer.");
            System.out.print("Take one down, ");
            System.out.print("Pass it around, ");

            beerNum = beerNum - 1;

            if (beerNum == 1) {
                word = "bottle";
            }

            if (beerNum == 0) {
                word = "bottles";
            }

            System.out.println(beerNum + " " + word + " of beer on the wall.");

            if (beerNum == 0) {
                System.out.println("No more bottles of beer on the wall, no more bottles of beer.");
                System.out.println("Go to the store and buy some more, 99 bottles of beer on the wall.");
            }
        }

    }
}
