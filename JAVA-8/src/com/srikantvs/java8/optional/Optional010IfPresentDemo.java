package com.srikantvs.java8.optional;

import java.util.stream.IntStream;

public class Optional010IfPresentDemo {

    public static void main(String[] args) {
        
        // orElse method returns value if value is present and returns the default value when value is absent.
        // ifPresent invoke the consumer if the value is present o/w does nothing when value is absent.
        
        
        IntStream.rangeClosed(1, 100)
                 .reduce((x,y)->x+y)
                 .ifPresent(total->System.out.println(total));
        
        
        
        
        
        
    }

}
