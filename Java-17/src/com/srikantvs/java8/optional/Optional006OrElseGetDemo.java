package com.srikantvs.java8.optional;

import java.util.Optional;

public class Optional006OrElseGetDemo {

    public static void main(String[] args) {

        // orElse vs orElseGet
        // orElseGet takes a supplier.
        // orElse takes a value.
        
        
        // When optional is empty.
        // --------------------------
        String orElse = (String) Optional.ofNullable(null).orElse(willThisBeCalled());
        String orElseGet = (String) Optional.ofNullable(null).orElseGet(()->willThisBeCalled());
        //---------------------------------------------------------------------------
        //  I'm called.
        //  I'm called.
        
        
        //When optional is not empty.
        //------------------------------
        String orElse1 = (String) Optional.ofNullable("Srikant V S").orElse(willThisBeCalled());
        String orElseGet1 = (String) Optional.ofNullable("Srikant V S").orElseGet(()->willThisBeCalled());
        
        //  I'm called.
        
        
        
        // Obs: We can see that even if the value is not null orElse method
        // is calling the method simply. 
        // but the orElseGet did not do this it only called when the optinal was empty.
        
        
    }

    private static String willThisBeCalled() {
        System.out.println("I'm called.");
        return "I'm default Value";
    }

}
