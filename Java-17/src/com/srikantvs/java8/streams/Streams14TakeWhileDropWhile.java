package com.srikantvs.java8.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams14TakeWhileDropWhile {

    public static void main(String[] args) {

        // Stream<Integer> x = Stream.<Integer>of(1,3,5,7,8,11); dekh lo bhaiya ye generics wala

        List<Integer> nums2 = Stream.of(1, 3, 5, 7, 8, 11)
                .takeWhile(num -> num % 2 != 0)
                .collect(Collectors.toList());

        System.out.println("takeWhile :: " + nums2);

        // dropWhile
        List<Integer> nums3 = Stream.of(1, 3, 5, 7, 8, 11)
                .dropWhile(num -> num % 2 != 0)
                .collect(Collectors.toList());

        System.out.println("dropWhile :: " + nums3);

    }

}
