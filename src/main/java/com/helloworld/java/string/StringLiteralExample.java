package com.helloworld.java.string;

public class StringLiteralExample {
    public static void main(String[] args) {
//      Example 1: Using String Literals

        String string = "Hello world";
        System.out.println("String literals: " + string);

//      Example 2: Using the new Keyword
        String string1 = new String("Hello world");
        System.out.println("String using new keyword: " + string1);

//       Immutable String in Java
        String str = "Hello";
        str.concat("world");
        System.out.println(str);

//        str=str.concat(" world");
        System.out.println(str);

        String string2 = "Hello";
        String string3 = "world";
        System.out.println(str==string2);
        System.out.println(str.equalsIgnoreCase(string2));

        System.out.println(str.equals("Hello"));
        System.out.println(str.equals(string2));

        System.out.println(str.compareTo(string2));
        System.out.println(str.compareTo(string1));
        System.out.println(string3.compareTo(str));


        //string concatenation
        String string4 = "hello";
        String string5 = "world";

        //using operator
        String result = string4+" "+string5;
        System.out.println(result);


        //using contcat();
        System.out.println(string4.concat(" ").concat(string5));

        //usint substring
        String string6 = "Hello world";
        String substring = string6.substring(7);
        System.out.println("using substring "+substring);
        String indexing = string6.substring(7,9);
        System.out.println("indexing "+indexing);

        //length
        System.out.println(string3.length());
        System.out.println(string3.charAt(2));
        System.out.println(string3.toUpperCase());
        System.out.println(string3.toLowerCase());
        String tr = "Hellow wolrd";
        System.out.println(tr.trim());
        System.out.println(tr.replace("HelloW","hi"));
        String[] tre = tr.split(",");
        System.out.println(tre);
        System.out.println(string3.indexOf("world"));

    }
}
