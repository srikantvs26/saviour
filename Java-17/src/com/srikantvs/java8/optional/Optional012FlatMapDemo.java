package com.srikantvs.java8.optional;

import java.util.Arrays;
import java.util.Optional;

import com.srikantvs.java8.data.Bike;
import com.srikantvs.java8.data.Student;

public class Optional012FlatMapDemo {

    public static void main(String[] args) {

        //flatMap -> Optional<Optional<String>> -> Optional<String>
        
        Optional<Optional<String>> greeting = Optional
                .ofNullable(Optional.ofNullable("Hello"));
        
        
        //see this.
        
        Optional<String> flatMap = greeting.flatMap(takeWithOptional->takeWithOptional);
        Optional<Optional<String>> map = greeting.map(takeWithOptional->takeWithOptional);
        
        
        greeting.flatMap(takeWithOptional->takeWithOptional)
                .ifPresent(greet->System.out.println(greet));
        
        
        
        Bike bike = new Bike("Some Bike", "R15");
        Optional<Bike> optionalBike = Optional.of(bike);
        Student student1 = new Student("Adam",2,3.6, "male",10,Arrays.asList("swimming", "basketball","volleyball"));
        student1.setBike(optionalBike);
        
        
        
        //What is the model of Bike?
        String bikeModel = Optional.ofNullable(student1)
                                   .flatMap(studentObject->studentObject.getBike())// bas kisi tarah se Optional<Optional<Bike>> le ke aajao. baaki flat map sambhal lega.
                                   .map(bikeIGot->bikeIGot.getModel())
                                   .orElse("Chetak");
        
        System.out.println(bikeModel);
        
        
       

       

    }

}
