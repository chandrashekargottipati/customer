package com.helloworld.java.conditionalstements.loops;

import java.util.Random;
import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        // Uncomment the desired loop type and comment out the others as needed.

        // While loop example
        /*
        int number = 2;
        int maxLimit = 100;

        while (number <= maxLimit) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
            number++;
        }
        */

        // For loop example
        /*
        int maxValue = 30;
        for (int number = 0; number < maxValue; number++) {
            if (number % 2 != 0) {
                System.out.println(number);
            }
        }
        */

        // Do-while loop example
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean success;
        int attempts = 0;

        do {
            attempts++;
            int number = random.nextInt(10) + 1; // Number between 1 and 10
            System.out.println("Attempt " + attempts + ": Guess the number (1-10): ");
            int guess = scanner.nextInt();
            success = (guess == number);

            if (!success) {
                System.out.println("Wrong guess. Try again!");
            }
        } while (!success);

        System.out.println("Congratulations! You guessed the number.");

        // Close the scanner resource
        scanner.close();
    }
}
