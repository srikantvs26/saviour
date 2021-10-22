package com.srikantvs.java8.defaultstaticmethods;

import java.util.Arrays;
import java.util.List;

public class DefaultMethods004MultiplierClientDemo {
    
    public static void main(String[] args) {
        
        Mulitipliable mulitipliable = new MultipliableImpl();

        List<Integer> numbers = Arrays.asList(1,23,566,56);
        System.out.println("Result : "+mulitipliable.muliply(numbers));
        System.out.println("Size is : "+mulitipliable.size(numbers));
        
        // accessing static method.
//        mulitipliable.isEmpty(numbers); Not accessible this way.
        
        System.out.println("static method : "+Mulitipliable.isEmpty(numbers));
        
    }

}
