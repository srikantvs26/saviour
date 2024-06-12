package com.srikantvs.java8.varargs;

import java.util.Arrays;
// However, it requires that these arguments be manually packaged into an
// array prior to calling vaTest( ). Not only is it tedious to construct an array each time vaTest( ) is
// called, it is potentially error-prone. The varargs feature offers a simpler, better option.
// A variable-length argument is specified by three periods (…).

public class BeforeVarArgsDemo {

    static void testMe(int[] x) {
        System.out.println("length of arguments :: " + x.length);
        int sum = Arrays.stream(x).sum();
        System.out.println("sum is :: " + sum);
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 3 };
        int[] b = { 1 };
        int[] c = {};

        testMe(a);
        testMe(b);
        testMe(c);

    }

}
