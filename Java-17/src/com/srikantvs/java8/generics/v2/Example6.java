package com.srikantvs.java8.generics.v2;

/**
 * 
 */
class K<N extends Number> {
    N n;

    public void m1() {
        System.out.println("double value passed is : " + n.doubleValue());
        System.out.println("int value passed is " + n.intValue());
    }

    public K(N n) {
        this.n = n;
    }
}

public class Example6 {

    public static void main(String[] args) {

        K<Number> k1 = new K<Number>(10);
        k1.m1();

        K<Number> k2 = new K<Integer>(10); // ERROR, It has to be precise type

        K<Integer> k3 = new K<Integer>(10);
        k3.m1();

        K<Double> k4 = new K<>(14.4); // Using Diamond Operator
        k4.m1();

        // Bound mismatch: The type String is not a valid substitute for the bounded parameter <N extends Number> of the type K<N>
        K<String> k5 = new K<String>("hi");// String don't extend Number

    }

}
