package com.srikantvs.java8.itsssstime;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class DateTime011LocalTimeGettingDemo {

    public static void main(String[] args) {

        LocalTime localTime = LocalTime.now();
        System.out.println("localtime : "+localTime);//00:21:52.463


        System.out.println("getHour : "+localTime.getHour());
        System.out.println("getMinute : "+localTime.getMinute());
        System.out.println("getSecond : "+localTime.getSecond());
        System.out.println("getNano : "+localTime.getNano());
        System.out.println("HOUR_OF_AMPM : "+localTime.get(ChronoField.HOUR_OF_AMPM));
        System.out.println("AMPM_OF_DAY : "+localTime.get(ChronoField.AMPM_OF_DAY));
        System.out.println("MILLI_OF_SECOND : "+localTime.get(ChronoField.MILLI_OF_SECOND));

    }

}
