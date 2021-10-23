package com.srikantvs.java8.itsssstime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.chrono.Era;
import java.time.chrono.IsoChronology;
import java.time.temporal.ChronoField;

public class DateTime003GettingValuesDemo {

    public static void main(String[] args) {
        
        LocalDate localDate = LocalDate.of(2021, Month.OCTOBER, 21);
        
        // I want to get values form this localDate.
        
        int dayOfMonth = localDate.getDayOfMonth();
        System.out.println("dayOfMonth : "+dayOfMonth);//21
        
        int dayOfYear = localDate.getDayOfYear();
        System.out.println("dayOfYear : "+dayOfYear);//294
        
        int monthValue = localDate.getMonthValue();
        System.out.println("monthValue : "+monthValue);//10
        
        int year = localDate.getYear();
        System.out.println("year : "+year);//2021
        
        DayOfWeek dayOfWeek = localDate.getDayOfWeek();
        System.out.println("dayOfWeek : "+dayOfWeek);//THURSDAY
        
        Month month = localDate.getMonth();
        System.out.println("month : "+month);//OCTOBER
        
        //-------------------------------------------------------------
        
        IsoChronology chronology = localDate.getChronology();
        System.out.println("chronology : "+chronology);//ISO
        
        Era era = localDate.getEra();
        System.out.println("era : "+era);//CE
        
        System.out.println(localDate.getLong(ChronoField.DAY_OF_MONTH));//21 // explore here, many more things are here.
        System.out.println(localDate.get(ChronoField.DAY_OF_WEEK));//4 // explore here, many things are here.
        
        
        
    }

}
