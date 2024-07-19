package com.helloworld.java.conditionalstements;

public class CustomerMembership {
    public static void main(String[] args) {
        //discount - product - customer member ship and brand
        /*
         * customer member ship
         * diamond - 20
         * gold 15
         * silver 10
         * ohthers 5
         * */
        int productPrice;
        productPrice = 30000;
        int discount;
        int discountPercentage;
        discountPercentage = 0;
        char memerShip;
        memerShip = 'D';
        if (memerShip == 'D') {
            discountPercentage = 20;
        } else if (memerShip == 'G') {
            discountPercentage = 15;
        } else if (memerShip == 'S') {
            discountPercentage = 10;
        } else {
            discountPercentage = 5;
        }
//so int and int (discont and disocuntPerscnet)
        discount = productPrice * discountPercentage / 100;
        System.out.println("Price of discount "+discount+" Final price "+(productPrice - discount));
    }
}
