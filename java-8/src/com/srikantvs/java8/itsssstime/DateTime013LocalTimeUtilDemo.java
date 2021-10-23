package com.srikantvs.java8.itsssstime;

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class DateTime013LocalTimeUtilDemo {

    public static void main(String[] args) {

        LocalTime localTime = LocalTime.now();
        System.out.println("localtime : " + localTime);// 00:21:52.463

        // convert local time to seconds.
        System.out.println("local time to seconds : "+localTime.toSecondOfDay());
        
        
        
        // Time difference in seconds between two times.
        LocalTime localTime2 = LocalTime.now().withHour(13);
        LocalTime localTime3 = LocalTime.now().withHour(14);
        int difference = localTime3.toSecondOfDay()-localTime2.toSecondOfDay();
        System.out.println("difference in seconds: "+difference);
        
        
    }

}
