package com.srikantvs.java8.itsssstime;

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class DateTime012LocalTimeModifyingPlusMinusWithDemo {

    public static void main(String[] args) {
        
        LocalTime localTime = LocalTime.now();
        System.out.println("localtime : "+localTime);//00:21:52.463

        System.out.println("plusMinutes 2 : "+localTime.plusMinutes(3));
        System.out.println("plusSeconds 44 : "+localTime.plusSeconds(44));
        System.out.println("plusHours 3 : "+localTime.plusHours(3));
        System.out.println("ChronoUnit.HOURS 10 : "+localTime.plus(10,ChronoUnit.HOURS));

        //Similarly for minus.
        
        //with
        System.out.println("withHour 13 : "+localTime.withHour(13));
        System.out.println("withMinute 13 : "+localTime.withMinute(13));
        System.out.println("withSecond 13 : "+localTime.withSecond(13));
        System.out.println("ChronoField.SECOND_OF_DAY 21000 : "+localTime.with(ChronoField.SECOND_OF_DAY, 21000));// i want a time when second of day is 21000
        
        // Midnight
        
        System.out.println("MIDNIGHT : "+LocalTime.MIDNIGHT);// accessing in a static way.
        
        
        
        
        
    }

}
