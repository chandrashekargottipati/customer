package com.helloworld.java.collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExampl {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("hello");
//        hashSet.add(123456);
//        hashSet.add(3.45);
        hashSet.add("hello");
        hashSet.add("welocme");
        System.out.println(hashSet.size());
//        System.out.println(hashSet);
//        var iterator = hashSet.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

        for (String iterator : hashSet){
            System.out.println(iterator.toUpperCase());
        }
    }
}
