package com.srikantvs.java8.numericstreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class NumericStream006MapToLongMapToDoubleInNumericStreamDemo2 {

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
        
        IntStream.rangeClosed(1, 100).asLongStream();
        
        IntStream.rangeClosed(1, 50).mapToLong(takeThisInt->takeThisInt);
        
        
        
        
    }

}
