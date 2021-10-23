package com.srikantvs.java8.itsssstime;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Set;

public class DateTime028TimeZoneZoneOffsetDemo {

    public static void main(String[] args) {

        ZoneId systemDefault = ZoneOffset.systemDefault();
        System.out.println(systemDefault);//Asia/Calcutta
        
        ZoneOffset ofHours = ZoneOffset.ofHours(9);
        System.out.println("Korea Offset : "+ofHours); //+09:00
        
        ZoneOffset indiaOffset = ZoneOffset.ofHoursMinutes(5, 30);
        System.out.println("India Offset : "+indiaOffset);//+05:30
        
        
    }

}
