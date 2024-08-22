package com.helloworld.java.jav8feature;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionalInterfaces {
    public static void main(String[] args) {
        Predicate<Integer> isEvenorOdd = num -> num % 2 == 0;
        System.out.println(isEvenorOdd.test(100));


        List<String> customerlist = Arrays.asList("customer1", "customer2", "customer3");

//        Consumer<String> printnameconsumer = name-> System.out.println(name);
//        customerlist.forEach(name-> System.out.println(name));

//        customerlist.forEach(System.out::println);

        Function<String, String> uppercasecustomer = name -> {
            name = name.toUpperCase();
            return name;
        };

        customerlist.forEach(name-> System.out.println(uppercasecustomer.apply(name)));

    }
}
