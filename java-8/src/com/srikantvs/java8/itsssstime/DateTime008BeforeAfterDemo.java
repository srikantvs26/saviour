package com.srikantvs.java8.itsssstime;

import java.time.Clock;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class DateTime008BeforeAfterDemo {

    public static void main(String[] args) {
        
        LocalDate localDate = LocalDate.now();//2021-10-21
        LocalDate localDate2 = LocalDate.now()
                                        .with(TemporalAdjusters.firstDayOfMonth());//2021-10-01
        LocalDate localDate3 = LocalDate.now().plusYears(5);//2026-10-21
       
        
        
        // isBefore : is the date before that date
        System.out.println(localDate2.isBefore(localDate));//true
        System.out.println(localDate.isBefore(localDate2));//false
        
        
        //isAfter : is the date after that date
        System.out.println(localDate3.isAfter(localDate));//true
        System.out.println(localDate.isAfter(localDate3));//false
        
        
       
        
        
    }

}
