package com.srikantvs.java8.optional;

import java.util.Optional;
import java.util.OptionalLong;

public class Optional003OrElseGetThrowDemo {
    public static void main(String[] args) {
        
//        orElse : Return the value if present, otherwise return other.
//        orElseGet : 
//        orElseThrow : 
        
        
        // String orElse = Optional.ofNullable("hi").orElse("hello");
        // System.out.println(orElse);//hi
        // String orElse2 = (String) Optional.ofNullable(null).orElse("hello");
        // System.out.println(orElse2);//hello because optional is empty.
        
        // //-------------------------------------------------------------------
        
        String orElseGet = Optional.ofNullable("Good Morning").orElseGet(()->"Good Night");
        System.out.println(orElseGet);
        Object orElseGet2 = Optional.ofNullable(null).orElseGet(()->"Good Night");
        System.out.println(orElseGet2);
        
        //-------------------------------------------------------------------

     
        
        // String orElseThrow = Optional.ofNullable("Foo").orElseThrow(()->new NullPointerException("What the hell"));
        // System.out.println(orElseThrow);
        
        
        // try {
        //     String orElseThrow1 = (String) Optional.ofNullable(null).orElseThrow(()->new NullPointerException("What the hell"));
        // } catch (Exception e) {
        //     // TODO: handle exception
        //     System.err.println(e.getMessage());
        // }

        // Object orElseThrow2 = Optional.ofNullable(null).orElseThrow(); // java.util.NoSuchElementException: No value present
        
        
        
    }
}
