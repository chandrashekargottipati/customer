package java8feature;

public class Main {
    public static void main(String[] args) {
        Greeting greeting = new Greeting();
        greeting.greet();
        greeting.greet("Hello welcome");

        Greet greet = new Greet() {
            @Override
            public void greet() {
                System.out.println("inside class");
            }

            @Override
            public void greet(String msg) {
                System.out.println(msg);
            }
        };
        greet.greet();
        greet.greet("hello inside msg");



//        Runnable runnable = new Runnable() {
//            @Override
//            public void run() {
//
//            }
//        }

        Hello hello = (wish)-> System.out.println(wish);
        hello.sayHello("Hi how are you");
    }
}
