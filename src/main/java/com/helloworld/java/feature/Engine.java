package com.helloworld.java.feature;

public class Engine {
    void start() {
        System.out.println("engine start");
    }
}

class Car {
    private final Engine engine;

    Car(){
        this.engine = new Engine();
    }

    void startCar() {
       engine.start();
        System.out.println("car start");
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.startCar();
    }

}
