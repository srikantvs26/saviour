package com.srikantvs.java8.varargs;

import java.util.Arrays;

public class VarArgsDemo1 {
    static void testMe(int... x) {
        System.out.println("length of arguments :: " + x.length);
        int sum = Arrays.stream(x).sum();
        System.out.println("sum is :: " + sum);
    }

    public static void main(String[] args) {
        // Java include a feature that simplifies creation of methods that need to take
        // a variable number of arguments. This feature is called varargs also known as
        // variable length arguments.
        // A method that takes variable number of arguments is called varargs method.

        // printf method of Java's I/O libary

        testMe(1, 2, 3);
        testMe(4);
        testMe();

    }

}
