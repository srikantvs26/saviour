package com.srikantvs.java8.varargs;


public class VarArgsDemo4 {

    static void testMe(int... x) {
        for (int p : x) {
            System.out.println(p);
        }
    }

    // Not correct as both int... and int[] are arrays, method signature will be same.
    // static void testMe(int[] x) {
    //     for (int p : x) {
    //         System.out.println(p);
    //     }
    // }

    static void testMe(int x) {
        System.out.println(x);
    }

    public static void main(String[] args) {
        testMe(123, 34, 55, 666);
        testMe(4);
    }

}
