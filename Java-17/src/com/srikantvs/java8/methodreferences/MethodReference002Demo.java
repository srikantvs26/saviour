package com.srikantvs.java8.methodreferences;

import java.util.Comparator;
import java.util.function.Function;
import java.util.function.Predicate;

import com.srikantvs.java8.data.Student;

public class MethodReference002Demo {

    public static void main(String[] args) {
        
        // Type: a->a.method()     ==>        Class::method
        // Type: (a,b)->a.method(b) ==>       Class::method
        
        
        
        Function<String, String> upperCaseLambda = s->s.toUpperCase();
        Function<String, String> upperCaseMR = String::toUpperCase;
        
        System.out.println(upperCaseLambda.apply("elias samson"));
        System.out.println(upperCaseMR.apply("elias samson"));
        
        //-------------------------------------------------------------------
        
        Comparator<String> stringComparatorLE = (s1,s2)->s1.compareTo(s2);
        Comparator<String> stringComparatorMR =String::compareTo;
        
        System.out.println(stringComparatorLE.compare("Rabbit", "Rabbit"));
        System.out.println(stringComparatorMR.compare("Lion", "Rabbit"));
        
        
        
    }

}
