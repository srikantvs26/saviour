package com.srikantvs.java8.generics.v3.generic_methods.example2;

/*
 * Generic method type parameter T and class's T
 */
class B<T> {
    T a;

    static <T> void m1() { // this T is not the same T mentioned in B<T>, It's generic method T
        // recommended to use different type Like G, X etc.
    }
}

public class Example {

}
