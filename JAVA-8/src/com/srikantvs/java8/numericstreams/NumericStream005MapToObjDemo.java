package com.srikantvs.java8.numericstreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class NumericStream005MapToObjDemo {

    public static void main(String[] args) {

        /*
         * mapToObj : used to convert each element in numeric stream into some other object.
         * eg. int to char.
         */
        // chars() returns an intstream which we make to Stream<String>
        
        Stream<String> mapToObj = "Hello".chars().mapToObj(takeInteger->String.valueOf(takeInteger));

        List<String> hello = "Hello".chars().mapToObj(takeInteger->String.valueOf(takeInteger)).collect(Collectors.toList());
        System.out.println(hello);// [72, 101, 108, 108, 111]
        
        
        List<Character> hello2 = "Hello".chars().mapToObj(takeInteger->(char)takeInteger).collect(Collectors.toList());
        System.out.println(hello2); // [H, e, l, l, o]
        
        
               

//        int to Integer
        
        List<Integer> values = IntStream.of(1,2,3,4).mapToObj(intValu->Integer.valueOf(intValu)).collect(Collectors.toList());
        System.out.println(values);
        
        
    }

}
