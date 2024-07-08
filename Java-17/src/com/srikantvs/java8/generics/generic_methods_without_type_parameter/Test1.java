package com.srikantvs.java8.generics.generic_methods_without_type_parameter;

import java.util.ArrayList;
import java.util.List;

public class Test1 {

    public static void main(String[] args) {
        m1(new ArrayList<>(List.of(1, 2, 3)));
        m1(new ArrayList<>(List.of("world", "wrestling", "entertainment")));
    }

    /**
     * We can see that, m1 method can be called by any List of any type Integer or String,
     * We can add null to the list l
     * We cannot add any values to the list l, because we don't know the type of l which we will be getting from caller,
     * it can be an List of Integers, List of Strings etc.
     * 
     * This method is good for reading the values from caller
     * @param l
     */
    public static void m1(List<?> l) {
        l.add(null);
        // l.add("Hi"); ERROR
        System.out.println(l);

    }

}
