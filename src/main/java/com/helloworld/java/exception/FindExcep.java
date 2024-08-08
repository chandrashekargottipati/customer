package com.helloworld.java.exception;

import java.util.Scanner;

public class FindExcep {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter  number");
            int num1 = scanner.nextInt();
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("Enter number");
            int num2 = scanner1.nextInt();
        }catch (ArithmeticException e){
            System.out.println("you enter zero");
        }
    }
}
