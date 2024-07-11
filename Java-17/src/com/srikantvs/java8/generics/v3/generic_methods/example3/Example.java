package com.srikantvs.java8.generics.v3.generic_methods.example3;
/*
 * Generic constructors
 */

class A {
    double a;

    <X extends Number> A(X a) {
        this.a = a.doubleValue();
    }
}

public class Example {
    public static void main(String[] args) {
        A a1 = new A(23);
        A a2 = new A(1.1);
    }
}
