package com.srikantvs.java8.generics.v2;

/**
 * Multiple Generic Types
 */
class D<X, Y> {

}

public class Example7 {

    public static void main(String[] args) {

        D<String, Integer> d1 = new D<>();
        D<String, Integer> d2 = new D<String, Integer>();

        D<?, Integer> d3 = new D<String, Integer>(); // It works in Diamond operator if we don't specify anything it
                                                     // takes as Object. ? is any type so Object it can support.

        D<?, ? extends Number> d4 = new D<String, Integer>();
        D<?,? extends Number> d5 = new D<>();// on RHS type is <Object, Number>();

        //--- so on.

    }

}
