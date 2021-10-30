package day02;

import java.util.Scanner;

public class MathMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Mathematics mathematics = new Mathematics();

        System.out.println("Give me a number: ");
        int number = scanner.nextInt();
        scanner.close();

        System.out.println("This number is prime: " + mathematics.isPrime(number));
    }
}