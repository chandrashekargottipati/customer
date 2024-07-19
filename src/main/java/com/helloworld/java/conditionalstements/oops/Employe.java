package com.helloworld.java.conditionalstements.oops;

public class Employe {
    int id;
    String name;
    String email;
    String password;
    byte age;

    //with out retrun and parameters

    void displayEmployeDetails(){
        System.out.println("Id "+id);
        System.out.println("Name "+name);
        System.out.println("Email "+email);
        System.out.println("Password "+password);
        System.out.println("age "+age);

    }

    //with parameter
    void displayEmployename(String name){
        System.out.println("Employe name is "+name);
    }

    //with return type
    byte discount(){
        System.out.println("disocunt method call......");
        byte discount = 0;
        if(age>=60){
            discount = 30;
        } else if (age >= 50 && age <=60) {
            discount = 10;
        }else {
            discount = 5;
        }

        return discount;
    }

    //return and parameters
    double finalproductpriceAfterDiscount(double price){
        byte discountprice = discount();
        return price - (discountprice * price) / 100;

    }
}
