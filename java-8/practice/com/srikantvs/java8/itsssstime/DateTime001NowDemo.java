package com.srikantvs.java8.itsssstime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTime001NowDemo {

    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();
        System.out.println("LocalDate : " + localDate);

        LocalTime localTime = LocalTime.now();
        System.out.println("LocalTime : " + localTime);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("LocalDateTime : " + localDateTime);

        // LocalDate : 2021-10-21
        // LocalTime : 22:21:36.910
        // LocalDateTime : 2021-10-21T22:21:36.910

    }

}
