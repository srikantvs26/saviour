package com.srikantvs.java8.methodreferences;

import java.util.function.Function;
import java.util.function.Predicate;

import com.srikantvs.java8.data.Student;

public class MethodReference001Demo {

    public static void main(String[] args) {

        // Method references are introduced in Java 8.
        // used to simplify where the lambda expression is there and the lambda
        // expression is just only a method call.
        // eg.

         Function<String, Integer> stringLambda = s->s.length(); // Method Reference can be applied.
         Function<String, Integer> stringMR = String::length;
        
        
        
         Predicate<Student> predicateUsingLambda = s->s.getGradeLevel()>=3.5; // Method Reference not applicable.

    
       
    }

}
