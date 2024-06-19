package com.srikantvs.java8.numericstreams;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class NumericStream003SumMaxMinAverageDemo {

    public static void main(String[] args) {
        /*
         * the aggregate function in Numeric Streams are.
         * 
         * sum
         * min
         * max
         * avg
         */

        int sum = IntStream.rangeClosed(1, 100).sum();
        System.out.println(sum);

        // note the Optional here.
        // it is good when stream is empty.

        OptionalInt min = IntStream.rangeClosed(1, 100).min();
        min.ifPresent(minVal -> System.out.println(minVal));

        OptionalInt max = IntStream.rangeClosed(1, 100).max();
        max.ifPresent(maxVal -> System.out.println(maxVal));

        OptionalDouble average = IntStream.rangeClosed(1, 100).average();
        average.ifPresent(avgVal -> System.out.println(avgVal));

    }

}
