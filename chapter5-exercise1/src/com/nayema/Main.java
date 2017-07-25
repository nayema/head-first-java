package com.nayema;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int numOfGuesses = 0;

        GameHelper helper = new GameHelper();

        DotCom dot = new DotCom();
        int randomNum = (int)(Math.random() * 5);

        int[] locations = {randomNum, randomNum+1, randomNum+2};
        dot.setLocationCells(locations);
        boolean isAlive = true;

        while(isAlive == true) {
            String guess = helper.getUserInput("Enter a number: ");
            String result = dot.checkYourself(guess);
            numOfGuesses++;

            if(result.equals("kill")) {
                isAlive = false;
                System.out.println("You took " + numOfGuesses + " guesses.");
            }
        }
    }
}
