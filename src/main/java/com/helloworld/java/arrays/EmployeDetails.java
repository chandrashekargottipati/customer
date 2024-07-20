package com.helloworld.java.arrays;

import jdk.jshell.PersistentSnippet;

public class EmployeDetails {
    public static void main(String[] args) {
        int[] array = new int[5];
        System.out.println(array[3]);

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;

            System.out.println(array[i]);
        }

        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        Person[] person = new Person[2];
        person[0] = new Person("chandu", 30);
        person[1] = new Person("sai", 23);

        System.out.println(person[0].age);
        System.out.println(person[1].age);

        Sum sum = new Sum();
        int[] arr = sum.employeid;

        Sum.sum(arr);



        int size = 5;
        int[] resultArr = sum.createArray(size);
        System.out.println(resultArr);

        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+"");
            }
            System.out.println();
        }

    }
}

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


}

// passing array to method

class Sum {
    int[] employeid = {2, 3, 8, 5, 6};

    public static void sum(int[] arr) {
        int add = 0;
        for (int i = 0; i < arr.length; i++) {
            add += arr[i];
        }
        System.out.println("sum of array numbers " + add);
    }


    public static int[] createArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = i;
        }
        return array;
    }

}


