package com.srikantvs.java8.itsssstime;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class DateTime022PeriodDifferenceBetweenDatesV2Demo {

    public static void main(String[] args) {

        LocalDate startDateInclusive = LocalDate.of(1996, 8, 26);
        System.out.println("startDateInclusive : " + startDateInclusive);
        LocalDate endDateExclusive = LocalDate.now();
        System.out.println("endDateExclusive : " + endDateExclusive);

        // actual number of days between 2 days

        long between3 = ChronoUnit.DAYS.between(startDateInclusive, endDateExclusive);
        System.out.println("No. of days : " + between3);

        long until = startDateInclusive.until(endDateExclusive,ChronoUnit.DAYS);
        System.out.println("No. of days : " + until);

        long until2 = startDateInclusive.until(endDateExclusive, ChronoUnit.MONTHS);
        System.out.println("No of months : "+until2);
        
        
        
        /**
         * startDateInclusive : 1996-08-26 
         * endDateExclusive : 2021-10-22 
         * No. of days : 9188 No. of days : 9188
         * 
         */

    }

}
