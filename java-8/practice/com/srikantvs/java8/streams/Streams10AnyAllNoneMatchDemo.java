package com.srikantvs.java8.streams;

import java.util.Arrays;
import java.util.List;

public class Streams10AnyAllNoneMatchDemo {

    public static void main(String[] args) {

        /*
         * anymatch, allmatch, nonematch methods "work on streams" and take a
         * predicate as input and returns a boolean result based on the
         * condition.
         * 
         * anymatch : return true if any element of the stream matches the
         * predicate. allMatch : return true if all element matches the
         * predicate. nonMatch : return true if none of the elements of stream
         * match the predicate.
         */

        List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 10);

        boolean allMatch = numbers.stream().allMatch(number -> number % 2 == 0);

        System.out.println(allMatch);

        boolean anyMatch = numbers.stream().anyMatch(number -> number % 3 == 0);

        System.out.println(anyMatch);

        boolean noneMatch = numbers.stream()
                .noneMatch(number -> number % 7 == 0);

        System.out.println(noneMatch);

    }

}
