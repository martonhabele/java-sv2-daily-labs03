package day03;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int computersGuess = random.nextInt(1, 101);

        System.out.println("Try to guess the number from maximum of 6 guesses between 1-100:");

        for (int i = 0; i < 6; i++) {
            int humanGuess = scanner.nextInt();
            if (humanGuess < computersGuess) {
                System.out.println("Your guess is too low");
            }
            if (humanGuess > computersGuess) {
                System.out.println("Your guess is too high");
            }
            if (humanGuess == computersGuess) {
                System.out.println("Bingo!");
                break;
            }
        }
        System.out.println("My guess was: " + computersGuess);
    }
}