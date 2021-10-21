package com.srikantvs.java8.itsssstime;

import java.time.LocalDate;

public class DateTime006UtilMethodsDemo {

    public static void main(String[] args) {
        
        LocalDate localDate = LocalDate.now();
        
        // how to check year leap or not?
        if(localDate.withYear(2020).isLeapYear()) {// notice how I modified the date
            System.out.println("Leap year");
        }
        else {
            System.out.println("Not a leap year.");
        }
        
        
    }

}
