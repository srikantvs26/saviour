package com.srikantvs.java8.numericstreams;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class NumericStream001Demo {

    public static void main(String[] args) {
        
        /*
         * Numeric Stream : This is primitive values stream.
         * 
         * Stream<Integer> : this is slow because we have to deal with objects here.
         * Unboxing from Integer to int.
         * 
         * 
         * 
         * but, 
         * 
         * IntStream is fast because it is dealing with primitive values.
         * LongStream
         * DoubleStream
         * 
         */
     
        
        Integer sum0 = Stream.of(1,2,3,4,5,6).reduce(0, (a,b)->Integer.sum(a, b));
        System.out.println(sum0);
        //here a, b are converted from Integer to int first. because you see the sum method.
        
        /*
         *              public static int sum(int a, int b) {
         *                   return a + b;
         *              }
         */
        
        
        
        int sum = IntStream.rangeClosed(1, 6).sum();
        System.out.println(sum);
        
        
    }
    
    
}
