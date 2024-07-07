package com.srikantvs.java8.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsMethodsCircus {

    public static void main(String[] args) {

        ArrayList<Object> ll = new ArrayList<>();
        ll.add(new Object());
        test(ll);

        test2(List.of(1, 2, 3)); // Integer immutable list
        test2(List.of(1.2, 1.4, 5.7)); // Double immutable list

    }

    public static void test(ArrayList<? super String> l) {
        l.add("hello");
        l.add(null);
        // l.add(new Object()); C.E
        System.out.println(l);

    }

    public static void test2(List<? extends Number> l) {
        // l.add("hi");
        // l.add(null); If we had used ArrayList we could have added null, We are using List.of() method and it cannot contain null.
        l.add(new Integer(4));
        l.add(new Double(34.3));
        // We cannot add anything to l because we don't know if the list passed to l is of Integer type, Double type.

        System.out.println(l);
    }
}
