package com.srikantvs.java8.itsssstime;

import java.time.LocalTime;

public class DateTime015LocalTimeBeforeAfterDemo {

    public static void main(String[] args) {

        LocalTime localTime2 = LocalTime.now().withHour(13);
        LocalTime localTime3 = LocalTime.now().withHour(14);

        if (localTime2.isBefore(localTime3)) {
            System.out.println("localTime2 is before localTime3");
        } else {
            System.out.println("localTime2 is after localTime3");
        }


        if (localTime3.isAfter(localTime2)) {
            System.out.println("localTime3 is after localTime2");
        } else {
            System.out.println("localTime3 is before localTime2");
        }



    }

}
