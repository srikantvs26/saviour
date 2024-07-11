package com.srikantvs.java8.generics.v3.inheritance;

/**
 * Inheritance with Generics with Type forwarding from B to A
 */
class A<T> {
    T a;
}

/**
 * We can forward Type G from B to A, its very interesting scenario.
 * G for B is a declaration. type G is not known for B
 * G for A is a known type and is basically the effective type.
 * 
 * So, its understood that you know G when you create instance of B and when superclass instance will be created G will replace T.
 */
class B<G> extends A<G> {

}

public class Example3 {
    public static void main(String[] args) {

        B<Integer> b1 = new B<>();
        b1.a = 10; // A's a is Integer type

        System.out.println(b1.a.getClass());

    }
}
