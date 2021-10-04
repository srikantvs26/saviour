package com.srikantvs.java8.numericstreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStream004BoxingUnboxingDemo {

    public static void main(String[] args) {

        
        // Boxing : converting primitive type to wrapper type.
        // int -> Integer
        
        // But why boxing is required in stream?
        // It is required because Collectors don't work with Primitive Streams
        // so we need to convert them to thier wrapper type. with boxed() method.
        
        
        
        
        // Unboxing : Wrapper type to primitive type.
        // Integer -> int. 
        
        
        // Boxing int -> Integer. boxed()
        List<Integer> listOfIntegers = IntStream.rangeClosed(1, 100)
                //int
                .boxed()
                //Integer
                .collect(Collectors.toList());
        
        System.out.println(listOfIntegers);
        
        //Unboxing : Integer -> int mapToInt
        //lets use listOfIntegers as it is List of Integer.
        
        
        // mapToInt converts the stream into intstream
        
        
        int sum = listOfIntegers.stream().mapToInt(takeThisWrapper->takeThisWrapper).sum();
        System.out.println(sum);
        
        int sum2 = listOfIntegers.stream().mapToInt(thisWrapper->thisWrapper.intValue()).sum();
        System.out.println(sum2);
        
        
        
    }

}
