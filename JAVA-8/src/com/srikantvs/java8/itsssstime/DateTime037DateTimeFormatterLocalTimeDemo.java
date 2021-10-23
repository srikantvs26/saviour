package com.srikantvs.java8.itsssstime;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTime037DateTimeFormatterLocalTimeDemo {

    public static void main(String[] args) {

        //formatting : 

        LocalTime localTime = LocalTime.NOON;
        System.out.println("localTime : "+localTime);

        String timeFormat1 = localTime.format(DateTimeFormatter.ISO_TIME);
        System.out.println("timeFormat1 : "+timeFormat1);


        // parsing v1

        String time = "16:55";
        LocalTime localTime2 = LocalTime.parse(time);
        System.out.println("time : "+time);
        System.out.println("localTime2 : "+localTime2);


        // parsing v2
        String time2 = "04:14 PM";//hh:mm a
        LocalTime localTime3 = LocalTime.parse(time2, DateTimeFormatter.ofPattern("hh:mm a"));
        System.out.println("time2 : "+time2);
        System.out.println("localTime3 : "+localTime3);


    }

}
