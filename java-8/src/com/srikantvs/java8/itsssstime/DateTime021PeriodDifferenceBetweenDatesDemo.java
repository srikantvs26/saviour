package com.srikantvs.java8.itsssstime;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class DateTime021PeriodDifferenceBetweenDatesDemo {

    public static void main(String[] args) {
        // Period Use case : Mainly used to calculate the difference between 2
        // dates.
        
        // between
        
        LocalDate startDateInclusive = LocalDate.of(2020, 2, 21);
        System.out.println("startDateInclusive : "+startDateInclusive);
        LocalDate endDateExclusive= LocalDate.now();
        System.out.println("endDateExclusive : "+endDateExclusive);
        
        Period between = Period.between(startDateInclusive, endDateExclusive);
        
        System.out.println("getDays : "+between.getDays());// it will just subtract bro. It will not give total days
        System.out.println("getMonths : "+between.getMonths());
        System.out.println("getYears : "+between.getYears());
        System.out.println("toTotalMonths : "+between.toTotalMonths());// toTotalDays are not there see next example.
        
        System.out.println("-----------------------------------------------------");
        
        //until
        
        Period between2 = startDateInclusive.until(endDateExclusive);
        
        System.out.println("getDays : "+between2.getDays());
        System.out.println("getMonths : "+between2.getMonths());
        System.out.println("getYears : "+between2.getYears());
        System.out.println("toTotalMonths : "+between2.toTotalMonths());
        
       
    }

}
