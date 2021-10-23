package com.srikantvs.java8.itsssstime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime038DateTimeFormatterLocalDateTimeDemo {

    public static void main(String[] args) {

        //formatting : 

        LocalDateTime localDateTime = LocalDateTime.now();
        String timeFormat1 = localDateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);// yaha pe aap apna pattern bana k bhi de sakte ho.
        System.out.println("localDateTime : "+localDateTime);
        System.out.println("date time Format1 : "+timeFormat1);

        System.out.println("---------------------------------------------------------");

        // parsing v1
        String dateTime = "22/10/2021 04:55 AM";
        LocalDateTime localDateTime2 = LocalDateTime.parse(dateTime, DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm a"));
        System.out.println("dateTime : "+dateTime);
        System.out.println("localDateTime2 : "+localDateTime2);

        System.out.println("---------------------------------------------------------");

        // parsing v2
        String dateTime2 = "2021-10-22T15:57:03.061";
        LocalDateTime localDateTime3 = LocalDateTime.parse(dateTime2);// date already usi format me hi hai.
        System.out.println("dateTime2 : "+dateTime2);
        System.out.println("localDateTime3 : "+localDateTime3);

        System.out.println("---------------------------------------------------------");

        // parsing v3
        String dateTime3 = "2021-10-22T15:57:03";
        LocalDateTime localDateTime4 = LocalDateTime.parse(dateTime3, DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss"));// take care of single quotes around T
        System.out.println("dateTime3 : "+dateTime3);
        System.out.println("localDateTime4 : "+localDateTime4);

    }

}
