package com.helloworld.java.conditionalstements.oops;

public class Main {
    public static void main(String[] args) {
        int x;
        x = 10;
        System.out.println(x);
        Employe employe = new Employe();
        System.out.println(employe.id);
        System.out.println(employe.name);
        System.out.println(employe.email);
        System.out.println(employe.password);

        Employe employe1 = new Employe();
        employe1.id = 1;
        employe1.name = "employe 1";
        employe1.email = "employe1 name";
        employe1.password = "employe1 password";
        employe1.age = 63;
        employe1.displayEmployeDetails();

        Employe employe2 = new Employe();
        employe2.id = 2;
        employe2.age = 52;
        employe2.name = "employe 2";
        employe2.email = "employe2 name";
        employe2.password = "employe2 password";
        employe2.displayEmployeDetails();

        employe1.displayEmployename("chandu");
        employe2.displayEmployename("sekhar");


        byte disocnt = employe1.discount();
        byte discount1 = employe2.discount();
        System.out.println(employe1.name + " get disocunt " + disocnt);
        System.out.println(employe2.name + " get disocunt " + discount1);
        System.out.println(employe1.name+" have discount "+employe1.discount()+" so final product "+employe1.finalproductpriceAfterDiscount(25000));
        System.out.println(employe2.name+" have discount "+employe2.discount()+" so final product "+employe2.finalproductpriceAfterDiscount(25000));


    }
}
