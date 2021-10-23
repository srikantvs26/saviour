package com.srikantvs.java8.localvariableinlambda;

import java.util.function.Consumer;

public class LocalVariableWithLambda06Demo {

    public static void main(String[] args) {

        // Effectively final : lambda's are allowed to use local variables but not allowed 
        // to modify it even though they are not declared final. This concept is called 
        // Effectively final.
        
        int value = 4;
        
        Consumer<Integer> c1 = (num)->{
            value=33;
            System.out.println(value);
        };
        
        
        // Adv.
        // Easy to perform concurrency operatinons.
        // Promotes Functional Programming, Demotes the imperative style programming.
        
    }

}
