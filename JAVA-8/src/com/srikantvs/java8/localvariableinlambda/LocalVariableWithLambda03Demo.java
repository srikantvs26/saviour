package com.srikantvs.java8.localvariableinlambda;

import java.util.function.Consumer;

public class LocalVariableWithLambda03Demo {

    public static void main(String[] args) {

        // what is local variable?
        // Any variable that is declared inside a method is called local variable.
        
        
        // Lambda Expression have some restrictions on using local variables.
        // 1. Not allowed to use the same local variable name in the lambda parameters.
        // 2. Not allowed to re-assign a value to a local variable inside lambda expression.
        // 3. No restrictions on instance variables.
        
        
        // 2.
        int localVariable = 1;//local variable.
        Consumer<Integer> intConsumer = (x)->{
            System.out.println(x);
//->comment3            System.out.println(localVariable);
        };
        
        localVariable=500;
        
        
        // it means that once the local variable is used inside lamdba expression it just cannot be modified.
        // it becomes final or effectively final.
     
        
        
        

    }

}
