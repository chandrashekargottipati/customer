package com.helloworld.java.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListExampl {
    public static void main(String[] args) {
        List<Customer> linkedlist = new LinkedList<>();
//        List<Customer> linkedlist = new ArrayList<>();
        linkedlist.add(new Customer(1,"Anand"));
        linkedlist.add(new Customer(2,"balu"));
        linkedlist.add(new Customer(3,"chandu"));

        System.out.println("customer of index 1 "+linkedlist.get(0));
        linkedlist.set(1,new Customer(4,"div"));
        System.out.println("update customer list: "+ linkedlist);
        linkedlist.remove(2);
        System.out.println(linkedlist);
    }
}
