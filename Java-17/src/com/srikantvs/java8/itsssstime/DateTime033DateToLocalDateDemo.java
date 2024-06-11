package com.srikantvs.java8.itsssstime;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;

public class DateTime033DateToLocalDateDemo {

    public static void main(String[] args) {

        // We will convert java.util.date to java.time.LocalDate.

        Date date = new Date();
        System.out.println("Legacy Date : "+date);

        LocalDate toLocalDate = date.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDate();

        System.out.println("toLocalDate : "+toLocalDate);

        LocalTime toLocalTime = date.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalTime();

        System.out.println("toLocalTime : "+toLocalTime);

        LocalDateTime toLocalDateTime = date.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDateTime();

        System.out.println("toLocalDateTime : "+toLocalDateTime);


        // java.time.LocalDate to java.util.Date

        Date legacyDate2 = Date.from(LocalDate.now()
                .atTime(LocalTime.now()) //see DateTime017LocalDateTimeDemo.java atTime se hum log localDate me localTime add kar sakte hai.
                .atZone(ZoneId.systemDefault())
                .toInstant());

        System.out.println("legacyDate2 : "+legacyDate2);


        System.out.println("-------------Date to LocalDateTime---------------");

        Date date1 = new Date();
        LocalDateTime localDateTime2 = date1.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDateTime();
        System.out.println("date1 : "+date1);
        System.out.println("local date time : "+localDateTime2);

        System.out.println("-------------LocalDateTime to Date---------------");

        LocalDateTime localDateTime = LocalDateTime.now();
        Instant instant = LocalDateTime.now()
                .atZone(ZoneId.of("Asia/Calcutta"))
                .toInstant();
        Date date2 = Date.from(instant);
        System.out.println("local date time : "+localDateTime);
        System.out.println("date2 : "+date2);

    }



}
