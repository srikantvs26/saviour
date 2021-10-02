package com.srikantvs.java8.methodreferences;

import java.util.function.BiFunction;

public class MethodReference003Demo1 {

    public static void main(String[] args) {

        // Type: 
        //  a->SomeClass.method(a);         --> SomeClass::method
        // (a,b) -> SomeClass.method(a,b);  --> SomeClass::method
        // ()-> SomeClass.method();         --> SomeClass::method

      
        BiFunction<Integer, Integer, Integer> sumBiFunctionLE = (a,b)->Integer.sum(a, b);// here that Integer is that SomeClass
        System.out.println("sumBiFunctionLE : "+sumBiFunctionLE.apply(10, 20));
        
        BiFunction<Integer, Integer, Integer> sumBiFunctionMR = Integer::sum;
        System.out.println("sumBiFunctionMR : "+sumBiFunctionMR.apply(11, 12));
      
        
        
    }

}
