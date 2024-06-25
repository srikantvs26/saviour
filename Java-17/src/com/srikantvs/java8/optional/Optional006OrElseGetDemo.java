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
        String orElseGet = (String) Optional.ofNullable(null).orElseGet(() -> willThisBeCalled());

        // We are doing some stupid Casting
        String test = null;
        String test2 = Optional.ofNullable(test).orElseGet(()->willThisBeCalled());
        System.out.println("test2 :: "+test2);

        // When optional is not empty.
        String orElse1 = Optional.ofNullable("Srikant V S").orElse(willThisBeCalled());
        String orElseGet1 = Optional.ofNullable("Srikant V S").orElseGet(() -> willThisBeCalled());

        // Observation
        // We can see that even if the value is not null orElse method is calling the method simply.
        // but the orElseGet did not do this it only called when the optional was empty.
        // orElse works good when you give single value as in previous example, instead of calling a method

    }

    private static String willThisBeCalled() {
        System.out.println("I'm called.");
        return "I'm default Value";
    }

}
