package com.srikantvs.java8.local_variable_type_inference;

class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks!! Woof Woof!!");
    }
}

public class TypeReference_Polymorphism {
    public static void main(String[] args) {

        Animal a = new Animal();
        Animal a2 = new Dog();

        a.sound();
        a2.sound();

        System.out.println("==================================================");

        var p1 = new Animal();
        var p2 = new Dog();

        p1.sound();
        p2.sound();

        p1 = p2; // superclass can point to subclass
        p2 = p1; // subclass cannot point to superclass

        System.out.println(p1 instanceof Animal);// animal is an animal
        System.out.println(p2 instanceof Animal); // dog is an animal
        System.out.println(p1 instanceof Dog); // animal is not dog, false

    }
}
