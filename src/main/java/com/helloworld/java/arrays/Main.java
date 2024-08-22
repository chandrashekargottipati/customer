package com.helloworld.java.arrays;

class Solution {
    public static int findMissingElement(int[] arr, int n) {
        // Calculate the expected sum of numbers from 1 to n
        int expectedSum = n * (n + 1) / 2;

        System.out.println(expectedSum);

        // Calculate the sum of elements present in the array
        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }

        // The missing number is the difference between expectedSum and actualSum
        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        int n = 5;
        int[] arr = {1, 3, 4}; // Example array
        System.out.println(findMissingElement(arr, n)); // Output will be 4
    }
}
