package com.srikantvs.java8.method_hiding;
class Animal {
    static void sound() {
        System.out.println("animal makes sound");
    }
}

public class MethodHidingDemo2 extends Animal {
    static void sound() { // its redefinition, not override.
        System.out.println("dog barks!");
    }

    public static void main(String[] args) {

        Animal[] animals = { new Animal(), new MethodHidingDemo2(), new Animal(), null};

        for (int i = 0; i < animals.length; i++) {
            animals[i].sound(); // shoudn't be called this way, just to show, its a static method.
        }

        MethodHidingDemo2.sound();// hiding the sound method of Animal class

    }

}

/* 
 * please see that we have also passed null also, we are not getting NPE.
 * static methods are resolved at compile time, it depends on the Type of class
 * not on the runtime object of that class.
 * 
 * More : https://stackoverflow.com/questions/16313649/what-is-method-hiding-in-java-even-the-javadoc-explanation-is-confusing
 */

/*
 * static methods can't be overridden! This doesn't mean they can't be redefined
 * in a subclass, but redefining and overriding aren't same.
 */

/*
 * bhai dhayn se dekho, static methods ko aap override nahi kar sakte
 * to jab jub hum animal reference se sound method ko call kar rahe hai
 * to animal ka hi call hoga. but jub hum MethodHidingDemo2.sound() call karenge wo Animal class 
 * ke sound() method ko hide kar dega isi ko hum method hiding bolte hai.
 */