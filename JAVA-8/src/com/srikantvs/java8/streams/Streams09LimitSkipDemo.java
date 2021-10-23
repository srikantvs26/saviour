package com.srikantvs.java8.streams;

import java.util.Arrays;
import java.util.List;

public class Streams09LimitSkipDemo {

    public static void main(String[] args) {
        /*
         * limit : method is used to limit the stream to some specified elements
         * say 6, 7 skip : method is used to skip some specified elements from
         * starting of stream.
         * 
         */

        // eg.

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        long count = numbers.stream().limit(6).count();

        System.out.println(count);// 6

        long count2 = numbers.stream().skip(6).count();

        System.out.println(count2);// 4

    }

}
