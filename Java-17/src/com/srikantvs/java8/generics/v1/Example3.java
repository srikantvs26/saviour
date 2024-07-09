package com.srikantvs.java8.generics.v1;

class Foo<T> {
    // T cannot be used with static context, its only for instance related members of class
    static T x; // Cannot make a static reference to the non-static type T

    static void m1(T x) {

    }
}

public class Example3 {

}
