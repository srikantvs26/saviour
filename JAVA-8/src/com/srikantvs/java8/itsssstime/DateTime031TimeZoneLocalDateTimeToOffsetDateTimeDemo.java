package com.srikantvs.java8.itsssstime;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class DateTime031TimeZoneLocalDateTimeToOffsetDateTimeDemo {

    public static void main(String[] args) {

        // atOffset

        // LocalDateTime to OffsetDateTime

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("localDateTime : "+localDateTime);// 2021-10-22T13:20:35.893


        OffsetDateTime offsetDateTime = localDateTime.atOffset(ZoneOffset.ofHours(5));
        System.out.println("offsetDateTime : "+offsetDateTime);

        OffsetDateTime offsetDateTime1 = localDateTime.atOffset(ZoneOffset.ofHoursMinutes(5, 30));
        System.out.println("offsetDateTime1 : "+offsetDateTime1);

    }

}
