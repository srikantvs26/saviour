package com.srikantvs.java8.localvariableinlambda;

import java.util.function.Consumer;

public class LocalVariableWithLambda05Demo {

    static int instanceVariable = 1;//local instance variable.
    
    
    public static void main(String[] args) {

        // what is local variable?
        // Any variable that is declared inside a method is called local variable.
        
        
        // Lambda Expression have some restrictions on using local variables.
        // 1. Not allowed to use the same local variable name in the lambda parameters.
        // 2. Not allowed to re-assign a value to a local variable inside lambda expression.
        // 3. No restrictions on instance variables or static variables.
        
        
        // 3.
        
        Consumer<Integer> intConsumer = (x)->{
            System.out.println(x);
            System.out.println(instanceVariable);
        };
        
        instanceVariable=500;
        
        
       
        
        
        

    }

}
