package com.srikantvs.java8.itsssstime;

import java.time.Instant;

public class DateTime025InstantDemo {

    public static void main(String[] args) {
        // We know that LocalDate LocalTime, LocaDateTime are in human readable
        // format. 
        
        // Instant represent the time in a machine readable format.
        
        // Represents time in seconds from January 1 1970(EPOH) to current time of our machine.
        
        Instant instant = Instant.now();
        System.out.println("instant : "+instant);//instant : 2021-10-22T06:55:26.042Z 5:30 hours less than system
        
        System.out.println("getEpochSecond : "+instant.getEpochSecond()); // jan 1 1970 se ab tak kitne seconds aa gye wo hai ye

        Instant instant2 = Instant.ofEpochSecond(0);
        System.out.println("instant2 : "+instant2);//1970-01-01T00:00:00Z
        
    }

}
