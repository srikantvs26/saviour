package com.srikantvs.java8.localvariableinlambda;

import java.util.function.Consumer;

public class LocalVariableWithLambda01Demo {

    public static void main(String[] args) {

        // what is local variable?
        // Any variable that is declared inside a method is called local variable.
        
        
        // Lambda Expression have some restrictions on using local variables.
        // 1. Not allowed to use the same local variable name in the lambda parameters.
        // 2. Not allowed to re-assign a value to a local variable inside lambda expression. 
        // 3. No restrictions on instance variables.
        
        
        // 1.
        int localVariable = 1;//local variable.
        Consumer<Integer> intConsumer = (localVariable)->System.out.println(localVariable);
        
        
        Consumer<Integer> intConsumer1 = (somethingOtherthan_localVariable)->System.out.println(somethingOtherthan_localVariable);
        
        
        

    }

}
