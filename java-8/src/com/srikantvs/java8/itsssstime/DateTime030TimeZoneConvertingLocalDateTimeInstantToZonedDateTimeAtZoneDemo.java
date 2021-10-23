package com.srikantvs.java8.itsssstime;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class DateTime030TimeZoneConvertingLocalDateTimeInstantToZonedDateTimeAtZoneDemo {

    public static void main(String[] args) {
        
        // atZone
        
        // LocalDateTime to ZonedDateTime
        
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("localDateTime : "+localDateTime);// 2021-10-22T13:20:35.893
        
        // abhi aap iss date to ZonedDateTime me convert karo. 
        
        ZonedDateTime zonedDateTime = localDateTime.atZone(ZoneId.of("Asia/Seoul"));
        System.out.println("zonedDateTime "+zonedDateTime);// 2021-10-22T13:20:35.893+09:00[Asia/Seoul]
        
        
        // Instant to ZonedDateTime
        
        System.out.println("----------------------------------------------------------------");
        
        Instant instant = Instant.now();
        System.out.println("instant : "+instant);//2021-10-22T07:52:24.473Z                Z matlab utc
        ZonedDateTime zonedDateTime2 = Instant.now().atZone(ZoneId.of("Asia/Seoul"));    // converting instant to ZonedDateTime
        System.out.println("zonedDateTime2 : "+zonedDateTime2);//2021-10-22T16:52:24.498+09:00[Asia/Seoul]
        
        
        
        
    }

    
    
}
