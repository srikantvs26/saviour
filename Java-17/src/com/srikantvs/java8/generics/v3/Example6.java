package com.srikantvs.java8.generics.v3;

/**
 * Changing order of Types.
 * Order in which Generics are sent to parent class type matters.
 */
class A<T, G> {
    T a;
    G b;
}

// B<Double, String> will go as A<String, Double>
class B<Q, Z> extends A<Z, Q> {

}

public class Example6 {
    public static void main(String[] args) {

        B<Double, String> b = new B<>();
        // a is String, and b is Double
        b.a = "Hi";
        b.b = 1.1;

        // Ordering matters
        A<Integer, String> a1 = new B<>();
        A<Integer, String> a2 = new B<Integer, String>();// ERROR

        A<Integer, String> a3 = new B<String, Integer>();

        // bhai pehla hi dusra hai, dusra hi pehla hai.
        A<? extends Number, ?> a4 = new B<String, Integer>();
        A<? extends Number, ?> a5 = new B<String, Double>();

    }

}
