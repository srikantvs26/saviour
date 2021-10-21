package com.srikantvs.java8.itsssstime;

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class DateTime010LocalTimeDemo {

    public static void main(String[] args) {
        
        LocalTime localTime = LocalTime.now();
        System.out.println("localtime : "+localTime);//00:21:52.463
        
        
        LocalTime localTime2 = LocalTime.of(16, 55, 12);
        System.out.println("localTime2 : "+localTime2);//16:55:12
        
        LocalTime localTime3 = LocalTime.of(16, 55);
        System.out.println("localTime3 : "+localTime3);//16:55
        
        
        
        
        
    }

}
