package com.srikantvs.java8.itsssstime;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;

public class DateTime029TimeZoneWithLocalDateTimeDemo {

    public static void main(String[] args) {
        
        
        LocalDateTime indiaLocalDateTime = LocalDateTime.now(ZoneId.ofOffset("GMT", ZoneOffset.ofHoursMinutes(5, 30)));
        System.out.println("indiaLocalDateTime : "+indiaLocalDateTime);
        
        LocalDateTime indiaLocalDateTime1 = LocalDateTime.now(ZoneId.of("Asia/Calcutta"));
        System.out.println("indiaLocalDateTime1 : "+indiaLocalDateTime1);
        
        
        // indiaLocalDateTime : 2021-10-22T13:09:00.208
        // indiaLocalDateTime1 : 2021-10-22T13:09:00.339

        // there is no time zone information we can see What if we want to convert LocalDateTime, Instant to ZonedDateTime next example.
        
        
        LocalDateTime localDateTime = LocalDateTime.ofInstant(Instant.now(), ZoneId.of("Asia/Calcutta"));
        System.out.println("With instant creating local Date time : "+localDateTime);
        
        
        
        
    }

    
    
}
