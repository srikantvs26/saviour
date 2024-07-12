package com.srikantvs.java8.lists;

import java.util.Arrays;
import java.util.List;

public class ListOfDemo {

    public static void main(String[] args) {

        Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        List<Integer> ofList = List.of(numbers);
        // 1. numbers should NOT have any null values, o/w we get NPE
        // 2. ofList is immutable we cannot change its FIXED size or replace
        // elements
        // ofList.add(12); java.lang.UnsupportedOperationException
        // ofList.set(0, 8888); java.lang.UnsupportedOperationException

        List<Integer> asList = Arrays.asList(numbers);
        // 1. numbers can contain null values
        // 2. asList we cannot add/remove elements, but we can replace them
        // asList.add(34); java.lang.UnsupportedOperationException
        // asList.remove(0); java.lang.UnsupportedOperationException

        asList.set(0, 88888);

    }

}
