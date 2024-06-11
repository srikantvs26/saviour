package com.srikantvs.java8.optional;

import java.util.Optional;

public class Optional009IfPresentIsPresentDemo {

    public static void main(String[] args) {
        // isPresent: Return true if there is a value present, otherwise false.

        // ifPresent: If a value is present, invoke the specified consumer with the value,otherwise do nothing.
        
        Optional<String> ofNullable = Optional.ofNullable("Elias");
        if(ofNullable.isPresent()) {
            System.out.println(ofNullable.get());
        }
        else {
            System.out.println("Optional is empty.");
        }
        
        
        // no need to call get method with ifPresent
        ofNullable.ifPresent(takeWhatisThereInOptional->System.out.println(takeWhatisThereInOptional));
    }

}
