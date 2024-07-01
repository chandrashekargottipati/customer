package java8feature;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionalInterfaces {
    public static void main(String[] args) {
        Predicate<Integer> isevenPredicate = num -> num % 2 == 0;
        System.out.println(isevenPredicate.test(111));

        List<String> customerNameList = Arrays.asList("customer1", "customer2", "customer3");
        /*Consumer<String> printNameconsumer = name-> System.out.println(name);
        customerNameList.forEach(printNameconsumer);*/
        customerNameList.forEach(name-> System.out.println(name));

        Function<String,String> uppercaseFunction = name-> {
            name = name.toUpperCase();
            return name;
        };

        customerNameList.forEach(name-> System.out.println(uppercaseFunction.apply(name)));
    }
}
