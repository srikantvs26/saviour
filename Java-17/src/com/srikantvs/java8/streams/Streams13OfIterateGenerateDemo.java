package com.srikantvs.java8.streams;

import java.security.SecureRandom;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams13OfIterateGenerateDemo {

    public static void main(String[] args) {

        // Stream class factory methods to create a stream of values.
        /*
         * FINITE STREAM
         * --------------
         * of : creates a stream of certain values passed to this method.
         * 
         * INFINITE STREAM
         * ----------------
         * iterate and generate : used to create infinite stream.
         * 
         * iterate takes a seed value(initaial value) and a unaryoperator lambda
         * expression.
         * 
         * generate takes a supplier.
         * 
         */

        // ------------------------------- of
        // -------------------------------------------

        Stream<String> of = Stream.<String>of("adam");// dekh lo bhai wo generic wala ka example. :)
        Stream<String> stringStream = Stream.of("adam", "dan", "julie");
        stringStream.forEach(name -> System.out.println(name));

        // ------------------------------------- itereate
        // ---------------------------------

        Stream<Integer> exponentialStream = Stream.iterate(1, takeThis -> takeThis * 2);

        /*
         * here 1 is the seed or inital value.
         * takeThis->takeThis*2 this is the lambda expression for unary operator.
         * 
         */

        List<Integer> expoValues = exponentialStream.limit(5).collect(Collectors.toList());
        System.out.println(expoValues);// [1, 2, 4, 8, 16]

        Stream.iterate(0, val -> val + 2);

        // -------------------------------- generate
        // -------------------------------------

        // Q. So when we should use iterate and when we should go for generate?
        /*
         * A. Whenever we want to do some calculation with the value with got generated
         * by the stream we go for iterate method.
         * eg. I want even numbers. Stream.iterate(0, val->val+2);
         * 
         * Whenever we just want to blindly supply values (andhaaaa), NO CALCULATION
         * WITH THE RESULT. we go for generate method.
         * eg. I want 10 random numbers.
         */

        List<Double> randomNumbers = Stream.generate(() -> Math.random()).limit(5).collect(Collectors.toList());
        System.out.println(randomNumbers);

        // SecureRandom extends Random. :)
        SecureRandom sR = new SecureRandom();
        List<Integer> randomNumbers2 = Stream.generate(() -> sR.nextInt())
                .filter(number -> number % 2 > 0)
                .limit(5)
                .collect(Collectors.toList());

        System.out.println(randomNumbers2);

        // Method reference version.
        List<Integer> randomNumbers3 = Stream.generate(sR::nextInt)
                .filter(number -> number % 2 > 0)
                .limit(5)
                .collect(Collectors.toList());

        System.out.println(randomNumbers3);

    }

}
