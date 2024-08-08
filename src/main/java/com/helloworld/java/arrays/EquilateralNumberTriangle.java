package com.helloworld.java.arrays;

public class EquilateralNumberTriangle {
    public static void main(String[] args) {
        int size = 5; // Size of the triangle

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= 2 * size - 1; j++) {
                // Check if the current position is within the range to print a star
                if (j >= size - (i - 1) && j <= size + (i - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); // Move to the next line
        }
    }
}
