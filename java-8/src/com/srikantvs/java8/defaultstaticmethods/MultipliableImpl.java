package com.srikantvs.java8.defaultstaticmethods;

import java.util.List;

public class MultipliableImpl implements Mulitipliable {

    @Override
    public int muliply(List<Integer> integerList) {

        return integerList.stream()
                .mapToInt(num -> num.intValue())
                .sum();
    }

    // here we can override size method.
    @Override
    public int size(List<Integer> numbers) {
        System.out.println("overidden method is called...");
        return numbers.size();
    }

    // we cannot override static method as it is on Class Level.
}
