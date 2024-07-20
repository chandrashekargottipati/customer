package com.helloworld.java.feature;

public class Employe {
    int id;
    String name;
    Address address;//has relation

    public Employe(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    void display(){
        System.out.println(id+" "+name);
        System.out.println(address.city+" "+address.state+" "+address.country);
    }

    public static void main(String[] args) {
        Address address1 = new Address("vizag","andhra","india");
        Employe employe = new Employe(1,"dundu",address1);
        employe.display();
    }
}
