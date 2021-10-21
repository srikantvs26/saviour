package com.srikantvs.java8.itsssstime;

import java.time.Clock;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class DateTime007DateEqualOrNotDemo {

    public static void main(String[] args) {
        
        LocalDate localDate = LocalDate.now();
        LocalDate localDate2 = LocalDate.now().with(TemporalAdjusters.firstDayOfMonth());
        LocalDate localDate3 = LocalDate.now().plusYears(5);
        LocalDate localDate4 = LocalDate.now(Clock.systemDefaultZone());
        
        System.out.println(localDate.isEqual(localDate4));//true
        System.out.println(localDate.isEqual(localDate2));//false
       
        
        
    }

}
