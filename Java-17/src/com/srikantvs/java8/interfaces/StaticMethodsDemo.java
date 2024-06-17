package com.srikantvs.java8.interfaces;

import java.util.Date;

interface Bird {
    void sound();

    private static Date getTodayDate(){
        return new Date();
    }

    // utility method for Bird
    static double birdWeight(String type) {
        System.out.println("Today's Date :: "+getTodayDate());
        if (type.equals("HighFlying"))
            return 1.5;
        else if (type.equals("LowFlying"))
            return 2.5;
        else
            return 3.5;
    }

    String getBirdType();

    // static factory method to create instance of class that implement Bird
    static Parrot createParrot() {
        return new Parrot("LowFlying");
    }

    // not necessary that Pig has to implement Bird interface
    static Pig createPig() {
        return new Pig();
    }
}

class Pig {

}

class Duck implements Bird {
    String type;

    Duck(String type) {
        this.type = type;
    }

    @Override
    public void sound() {
        System.out.println("Quack Quack");
    }

    @Override
    public String getBirdType() {
        return type;
    }
}

class Parrot implements Bird {

    String type;

    Parrot(String type) {
        this.type = type;
    }

    @Override
    public void sound() {
        System.out.println("Hi there, I'm parrot");
    }

    @Override
    public String getBirdType() {
        return type;
    }

}

public class StaticMethodsDemo {
    public static void main(String[] args) {
        Bird dk = new Duck("Aquatic");
        dk.sound();
        System.out.println("Duck Weight is :: " + Bird.birdWeight(dk.getBirdType()));

        Parrot parrot = Bird.createParrot();
        System.out.println("Parrot Weight is :: " + Bird.birdWeight(parrot.getBirdType()));

        Pig pig = Bird.createPig();
        System.out.println(pig);
    }
}
