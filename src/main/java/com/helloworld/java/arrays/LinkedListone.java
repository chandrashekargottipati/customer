package com.helloworld.java.arrays;

import java.util.LinkedList;

public class LinkedListone {
    public static void main(String[] args) {
//        LinkedList<String> placeToVisit = new LinkedList<>();

        var placetoVisit = new LinkedList<String>();

        placetoVisit.add("amaravathi");
        placetoVisit.add(0,"guntur");

        addmorePlaces(placetoVisit);

        System.out.println(placetoVisit);
        removeElement(placetoVisit);

        System.out.println(placetoVisit);

        towniter(placetoVisit);
    }

    public static void addmorePlaces(LinkedList<String> list){
        list.addFirst("vijayawada");
        list.addLast("vizag");

        list.offer("hyderabad");
        list.offerFirst("nudurupadu");
        list.offerLast("pirangipuram");

        list.push("perecharla");
    }

    public static void removeElement(LinkedList<String> list){
        list.remove(4);
        list.remove("nudurupadu");

        System.out.println(list);
        String s1 = list.remove();
        System.out.println(s1+" removed");
    }

    public static void towniter(LinkedList<String> list){
        var prevtown = list.getFirst();
        for (String place : list){
            System.out.println("from "+prevtown+" to "+place);
            prevtown = place;
        }

        System.out.println("trip end last "+list.getLast());
    }
}
