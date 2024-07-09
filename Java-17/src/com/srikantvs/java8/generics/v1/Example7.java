package com.srikantvs.java8.generics.v1;
/**
 * Changing or adding the values inside generic types.
 */
class Foo<T> {
    T x;
}

public class Example7 {
    public static void main(String[] args) {

        // We can add/change only Integer values to f1
        Foo<Integer> f1 = new Foo<Integer>();
        f1.x =30;
        f1.x = 50;

        // The compiler is not sure of Type, it can be Double, Integer, Float etc.
        Foo<? extends Number> f2 = new Foo<Integer>();
        f2.x = 30; // ERROR

        Foo<?> f3 = new Foo<Integer>();
        f3.x=30;// ERROR


        // The compiler is sure that it will be Number or its Parent type. and Parent can point to Child type.
        Foo<? super Number> f4 = new Foo<Number>();
        f4.x=1.1; // Number pointing to Double
        f4.x=1;

        Foo<? super Number> f5 = new Foo<Object>();
        f4.x=1.1; // Object -> Double
        f4.x=1; // Object-> Integer





    }
}
