package com.helloworld.java.loops;

public class StarPattern {
    public static void main(String[] args) {
        int n = 5;

        // ex - 1
        /*for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }*/

        //ex - 2
        /*for(int i =0;i<n;i++){
            for (int j=0;j<n;j++){
                System.out.print("*");
                if (j!=n-1){
                    System.out.print("-");
                }
            }
            System.out.println();
        }*/

        //ex-3
        /*for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("* ");
                if (j!=c-1){
                    System.out.print("-");
                }
            }
            System.out.println();

        }*/

        //ex -4
        /*for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("*");
                if(j!=c-1){
                    System.out.print("-");
                }
            }
            System.out.println();
        }*/

        //ex - 5
        /*for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }*/

        //ex - 6
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < n; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
