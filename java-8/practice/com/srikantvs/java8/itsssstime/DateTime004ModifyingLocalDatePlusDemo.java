package com.srikantvs.java8.itsssstime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class DateTime004ModifyingLocalDatePlusDemo {

    public static void main(String[] args) {
        // how to modify LocalDate?

        LocalDate localDate = LocalDate.now();
        System.out.println("localDate : " + localDate);//2021-10-21

        // what is the date after 2 days?
        // as we know these date time api are immutable like String So,
        
        LocalDate plusDays = localDate.plusDays(2);
        System.out.println("plusDays 2 : "+plusDays);//2021-10-23
        
        LocalDate plusMonths = localDate.plusMonths(2);
        System.out.println("plusMonths 2 : "+plusMonths);
        
        LocalDate plusWeeks = localDate.plusWeeks(2);
        System.out.println("plusWeeks 2 : "+plusWeeks);
        
        LocalDate plusYears = localDate.plusYears(2);
        System.out.println("plusYears 2 : "+plusYears);
        
        LocalDate localDate2 = localDate.plus(2, ChronoUnit.MONTHS);// Similar to adding 2 months
        System.out.println("localDate2 Temporal Unit Variety 2 months: "+localDate2);
        
        LocalDate localDate3 = localDate.plus(Period.ofDays(22));
        System.out.println("localDate3 Period Variety 22 days : "+localDate3);
        
        
        
        // Similarly we have minus
        

    }

}
