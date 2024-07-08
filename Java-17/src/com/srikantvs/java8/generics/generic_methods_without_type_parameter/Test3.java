package com.srikantvs.java8.generics.generic_methods_without_type_parameter;

import java.util.ArrayList;
import java.util.List;

public class Test3 {

    public static void main(String[] args) {
        m1(new ArrayList<>(List.of(1, 2, 3)));
        m1(new ArrayList<>(List.of(1.1, 2.1, 3.1)));
        m1(new ArrayList<>(List.of(new Object(), new Object(), new Object()))); // OK

        // m1(new ArrayList<>(List.of("world", "wrestling", "entertainment"))); // ERROR
    }

    /**
     * We can see that, m1 method can be called by Number type, or its parent.
     * We can add null to the list l
     * We can add values to List l of only l type, 
     * 
     * This method is good for reading the values from caller
     * @param l
     */
    public static void m1(List<? super Number> l) {
        l.add(null);
        // l.add(new Object()); // ERROR
        l.add(20.6);// Double
        l.add(10); //Integer
        // l.add("Hi"); // ERROR as its String 
        System.out.println(l);

    }

}
