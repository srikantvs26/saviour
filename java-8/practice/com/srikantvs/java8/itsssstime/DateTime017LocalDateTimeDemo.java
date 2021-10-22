package com.srikantvs.java8.itsssstime;

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class DateTime017LocalDateTimeDemo {

    public static void main(String[] args) {
        
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("localDateTime : "+localDateTime);
        
        LocalDateTime localDateTime2 = LocalDateTime.of(2021, Month.OCTOBER, 22, 22, 55, 55);
        System.out.println("localDateTime2 : "+localDateTime2);
        
        
        // By combining LocalDate and LocalTime
        LocalDateTime localDateTime3 = LocalDateTime.of(LocalDate.now(), LocalTime.now());
        System.out.println("localDateTime3 : "+localDateTime3);
        
        
        
        // Creating LocalDateTime with LocalDate.
        LocalDateTime localDateTime4 = LocalDate.now().atTime(LocalTime.now());// now I have combined both localDate and localTime
        System.out.println("localDateTime4 : "+localDateTime4);
        
        
        
    }

}
