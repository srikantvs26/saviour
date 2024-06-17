package com.srikantvs.java8.interfaces;

import java.time.LocalTime;

interface Animal {

    void sound();

    default void born() {
        animalAction("BORN AND ALIVE");
    }

    default void death() {
        animalAction("DEAD");
    }

    // private methods supporting the default methods.
    private void animalAction(String action) {
        System.out.println("Animal is " + action + " at " + LocalTime.now());
    }

}

class Dog implements Animal {

    @Override
    public void sound() {
        System.out.println("Dog does Woof Woof");
    }

}

public class PrivateMethodsDemo {
    public static void main(String[] args) {

        Animal animal = new Dog();
        animal.sound();
        animal.born();
        animal.death();

    }
}
