package com.srikantvs.java8.generics.v3;

/**
 * Different examples, 
 */
class P<T, G> {
    T a;
    G b;
}

// back ward compatibility
class B extends P {

}

// both fixed
class C<Q, J> extends P<Integer, String> {

}

// 2nd fixed
class D<Q> extends P<Q, String> {

}

/**
 * Not much used in real world scenarios,
 */
class X<Q, E> extends P<Q, E> {

}

public class Example4 {
    public static void main(String[] args) {

        // We can see that when we don't specify type for C, P class types are also taken as Object,
        
        C c = new C();
        c.a = "Hello"; // A's a type is Integer, still we have assigned String to it
        c.a = 10;
        c.b = "Hello"; // same reason as above
        c.b = 10;

        C<Integer, Integer> c2 = new C<>();
        c2.a = "Hello"; // We get C.E here
        c2.b = "Hi";

        c2.a = 23;
        c2.b = 10;// Error

    }
}
