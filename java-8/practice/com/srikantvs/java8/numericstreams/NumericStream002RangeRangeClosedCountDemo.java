package com.srikantvs.java8.numericstreams;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStream002RangeRangeClosedCountDemo {

    public static void main(String[] args) {

        // sometimes we need some values from 1..100 , 1..99 etc.

        // iterating with loop is bit slow so we use range method from Intstream.

        // range(1,50) gives values from 1 to 49 .... 49 elements
        // rangeClosed(1,50) gives value from 1 to 50 .... 50 elements

        IntStream.range(1, 50);
        LongStream.range(1, 50);
        IntStream.rangeClosed(1, 50);
        LongStream.rangeClosed(1, 50);

        // DoubleStream.range(1,50); does not support. the reason is that both intstream
        // and longStream can be converted easily into double stream.
        // using asDoubleStream method.

        // count values in intstream
        long count = IntStream.range(1, 50).count();
        System.out.println("count : " + count);

        long count2 = IntStream.rangeClosed(1, 50).count();
        System.out.println("count2 : " + count2);

        
        //sum
        int sum = IntStream.rangeClosed(1, 50).sum();
        System.out.println("sum : "+sum);
        
        // double stream
        double sum2 = IntStream.rangeClosed(1, 50).asDoubleStream().sum();
        System.out.println("sum2 : "+sum2);
        
        
    }

}
