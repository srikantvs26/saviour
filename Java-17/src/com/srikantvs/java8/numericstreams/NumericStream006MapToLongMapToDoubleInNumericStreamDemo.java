package com.srikantvs.java8.numericstreams;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStream006MapToLongMapToDoubleInNumericStreamDemo {

    public static void main(String[] args) {

        /*
         * Some times when we are working with numeric stream we want to
         * convert it into LongStream, or DoubleStream
         * 
         * we can do with asLongStrea() and asDoubleStream() methods
         * but with these methods it just converts the stream
         * 
         * what if we want to change the values as well?
         * so we use mapToLong() and mapToDouble() methods
         * which apply some transformation function and then convert the
         * numeric stream to LongStream or DoubleStream.
         */

        LongStream asLongStream = IntStream.rangeClosed(1, 100).asLongStream();

        LongStream mapToLong = IntStream.rangeClosed(1, 50).mapToLong(takeThisInt -> Math.abs(takeThisInt) * 2);

    }

}
