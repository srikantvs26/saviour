package com.srikantvs.java8.optional;

import java.util.Optional;

public class Optional002CreatingOptionalDemo {
    public static void main(String[] args) {

        // there are 3 methods for creating optional object.
        // ofNullable() -> always safe
        // of() -> safe when non null value is passed o/w dangerous can throw NPE for null values.
        // empty() -> empty optional

        //empty : it returns an empty optional showing that there is no value inside it.
        Optional<Object> empty = Optional.empty();
        System.out.println(empty);

        //---------------------------------------------------------------------------------------------
        
        // of() method is good when we are very sure that the value coming inside of() is NOT NULL.
        // if of() gets a null value inside it it will throw NPE.
        
        // Optional<String> myName2 = Optional.of(null); Exception NPE.
        
        Optional<String> myName = Optional.of("Srikant V S");
        System.out.println(myName);
        System.out.println(myName.get());

        //---------------------------------------------------------------------------------------------
        
        //ofNullable is safe method because it will even handle the null values thrown it him.
        // and behaves same like of() when value is not null.
        
        Optional<String> emptyName = Optional.ofNullable(null);
        System.out.println(emptyName);//Optional.empty 
         
         Optional<String> myKris = Optional.ofNullable("Srikant V S");
         System.out.println(myKris);
         System.out.println(myKris.get());
         
    }
}
