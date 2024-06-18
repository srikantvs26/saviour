package com.srikantvs.java8.itsssstime;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateTimeApiEnhancementsJava17Demo {

    public static void main(String[] args) {

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("hh:mm B");

        var time1 = LocalDateTime.now().plusHours(12).format(dateTimeFormatter);
        var time2 = LocalDateTime.now().format(dateTimeFormatter);

        System.out.println(time1);
        System.out.println(time2);

        var localDateTime = LocalDateTime.now(ZoneId.of("Asia/Kolkata"));

        System.out.println(localDateTime.format(dateTimeFormatter));

    }

}
