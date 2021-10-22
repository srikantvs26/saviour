package com.srikantvs.java8.itsssstime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;

public class DateTime024DurationDifferenceInTimeDemo {

    public static void main(String[] args) {
        
        // DateTime013LocalTimeUtilDemo.java -> Check this file as well. 
        
        LocalTime localTimeMidNight = LocalTime.MIDNIGHT;
        LocalTime localTimeNoon = LocalTime.NOON;
        Duration between = Duration.between(localTimeMidNight, localTimeNoon);
        
        System.out.println("Number of seconds : "+between.getSeconds());
        System.out.println("Number of hours : "+between.toHours());
        System.out.println("Number of minutes : "+between.toMinutes());
        
        
    }

}
