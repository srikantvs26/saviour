package com.srikantvs.java8.generics.v2;
/*
 * Anonymous class example
 */

class Zoo<T> {
    public void play(T t) {
        System.out.println("Hello, " + t);
    }
}

interface Ioo<T> {
    public void play(T t);
}

public class Example2 {

    public static void main(String[] args) {

        // Java 7, It was mandatory to give Type parameter in anonymous class implementation.
        // Anonymous class is like extending the Zoo class.
        Zoo<String> f1 = new Zoo<String>() {
            // class that extends Zoo
            @Override
            public void play(String user) {
                System.out.println("Hola, " + user);
            }
        };
        f1.play("John");

        // Java 9, Even with anonymous classes we can remove the type., Java 7 and 8 It gives error.
        Zoo<String> f2 = new Zoo<>() {
            @Override
            public void play(String user) {
                System.out.println("Hola, " + user);
            }
        };
        

        f2.play("Jane");

    }

}
