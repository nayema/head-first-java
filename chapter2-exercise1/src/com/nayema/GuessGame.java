package com.nayema;

public class GuessGame {
    Player p1;
    Player p2;

    public void startGame() {
        p1 = new Player();
        p2 = new Player();

        int guessp1, guessp2;

        boolean p1isRight = false;
        boolean p2isRight = false;

        int targetNumber = (int)(Math.random() * 10);
        System.out.println("I'm thinking of a number between 0 and 9...");

        while (true) {
            System.out.println("Number to guess is " + targetNumber);

            p1.guess();
            p2.guess();

            guessp1 = p1.number;
            System.out.println("Player 1 guessed " + guessp1);
            guessp2 = p2.number;
            System.out.println("Player 2 guessed " + guessp2);

            if (guessp1 == targetNumber) {
                p1isRight = true;
            }
            if (p1isRight == true) {
                System.out.print("Player 1 got it right? ");
                System.out.println("Yes");
            } else {
                System.out.print("Player 1 got it right? ");
                System.out.println("No");
            }
            if (guessp2 == targetNumber) {
                p2isRight = true;
            }
            if (p2isRight == true) {
                System.out.print("Player 2 got it right? ");
                System.out.println("Yes");
            } else {
                System.out.print("Player 2 got it right? ");
                System.out.println("No");
            }
            if (p1isRight || p2isRight) {
                System.out.println("We have a winner!");
                System.out.println("Game is over!");
                break;
            } else {
                System.out.println("Please try again.");
            }
        }
    }
}
