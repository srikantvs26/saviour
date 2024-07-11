package com.srikantvs.java8.generics.v3.generic_methods.example1;

import java.util.Arrays;

/**
 * Methods with Generics
 */
class W implements Comparable<W> {

    @Override
    public int compareTo(W o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
    }

}

class U {

}

class A {

    <T> void m1() {
        // Generic method with type parameter T and return type void
    }

    <T> T m2(T p) {
        // Generic method with type parameter T and return type T
        T t = p;
        return t;
    }

    // <T> works for both static and non static methods
    public static <T> T m3() {
        return null;
    }

    static <T extends Comparable<T>> T findMax(T[] a) {
        T max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i].compareTo(max) > 0)
                max = a[i];
        }
        return max;
    }

    static <T extends Number> T canYouDigIt(T[] a) {
        System.out.println(Arrays.toString(a));
        return a[0];
    }

    /**
     * Framework methods
     * 
     * @param <T>
     * @param a
     * @param c
     */
    static <T> void doWork(T a, Class<T> c) {

    }

    static <T> T getBean(T a, Class<T> c) {
        return null;
    }

}

public class Example extends A {

    public static void main(String[] args) {
        A.doWork(10, Integer.class); // We have seen this in frameworks like Spring
        Integer ib = A.getBean(10, Integer.class);
        String sb = A.getBean("Hi", String.class);
        Double db = A.getBean(11.1, Double.class);

        Class<String> c1 = String.class;
        Class c2 = Number.class;

        W[] ws = { new W(), new W() };
        A.findMax(ws); // fine because W implements Comparable.

        U[] us = { new U(), new U() };
        A.findMax(us); // Error because we have specified constraint that it has to implement Comparable.

        canYouDigIt(new Integer[] { 1, 2, 3 }); // Yes Integer extends Number and respect the constraint applied on canYouDigIt method
        canYouDigIt(new String[] { "Hi" }); // Error

    }

}