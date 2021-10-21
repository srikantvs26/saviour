package com.srikantvs.java8.itsssstime;

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class DateTime014LocalTimeEqualOrNot {

    public static void main(String[] args) {

        // isEquals method is not there.
        
        LocalTime localTime2 = LocalTime.now().withHour(13);
        LocalTime localTime3 = LocalTime.now().withHour(14);
        if (localTime2.equals(localTime3)) {
            System.out.println("Both time are equal");
        } else {
            System.out.println("both time are not equal");
        }

        //-----------------------------------------------------------
        
        LocalTime localTime4 = LocalTime.now();
        LocalTime localTime5 = LocalTime.now();
        if (localTime4.equals(localTime5)) {
            System.out.println("Both time are equal");
        } else {
            System.out.println("both time are not equal");
        }

    }

}
