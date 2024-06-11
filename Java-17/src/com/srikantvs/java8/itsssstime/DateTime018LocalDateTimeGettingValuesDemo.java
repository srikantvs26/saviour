package com.srikantvs.java8.itsssstime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTime018LocalDateTimeGettingValuesDemo {

    public static void main(String[] args) {
        
        
        // getting values from LocalDateTime
        
        LocalDateTime localDateTime3 = LocalDateTime.of(LocalDate.now(), LocalTime.now());
        System.out.println("localDateTime3 : "+localDateTime3);
        
        
        System.out.println("getMinute"+localDateTime3.getMinute());
        System.out.println("getDayOfMonth"+localDateTime3.getDayOfMonth());
        
        // Same like before many more.
        
        
    }

}
