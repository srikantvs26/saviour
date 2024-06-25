package com.srikantvs.java8.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListVsArraysListExample {

    public static void main(String[] args) {

        // https://www.baeldung.com/java-arrays-aslist-vs-new-arraylist
        // https://stackoverflow.com/questions/16748030/difference-between-arrays-aslistarray-and-new-arraylistintegerarrays-aslist

        Integer[] someNumbers = { 1, 2, 3, 4, 5 };
        System.out.println("Original Array :: " + Arrays.toString(someNumbers));

        List<Integer> numbers = Arrays.asList(someNumbers);
        // numbers.add(34);// java.lang.UnsupportedOperationException
        // numbers.add(0, 77777);// java.lang.UnsupportedOperationException
        // numbers.remove(0); // java.lang.UnsupportedOperationException

        numbers.set(0, 888888); // We can see that changing the numbers is also changing someNumbers

        System.out.println("Original Array :: " + Arrays.toString(someNumbers));
        System.out.println("After replacing 0th element :: " + numbers);

        // using new ArrayList<>(); creates a separate array all together.
        ArrayList<Integer> numbers2 = new ArrayList<>(Arrays.asList(someNumbers));




        // ArrayStore
        List list = Arrays.asList(new String[]{"Hello"});
        list.set(0, 0); // java.lang.ArrayStoreException: java.lang.Integer


       
    }
}
