package com.srikantvs.java8.itsssstime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class DateTime005ModifyingLocalDateWithDemo {

    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        // I want the year to be 2025

        LocalDate withYear = localDate.withYear(2025);
        System.out.println("withYear 2025 : "+withYear);

        LocalDate withMonth = localDate.withMonth(12);
        System.out.println("withMonth 12 : "+withMonth);

        LocalDate withDayOfYear = localDate.withDayOfYear(365);
        System.out.println("withDayOfYear 365 : "+withDayOfYear);

        LocalDate withDayOfMonth = localDate.withDayOfMonth(25);
        System.out.println("withDayOfMonth 25 : "+withDayOfMonth);

        LocalDate chronoFieldDayOfMonth = localDate.with(ChronoField.DAY_OF_MONTH, 25);
        System.out.println("chronoFieldDayOfMonth 25 : "+chronoFieldDayOfMonth);

        LocalDate withTemporalAdjusters = localDate.with(TemporalAdjusters.firstDayOfMonth());
        System.out.println("withTemporalAdjusters firstDayOfMonth : "+withTemporalAdjusters);

        LocalDate withTemporalAdjusters2 = localDate.with(TemporalAdjusters.firstDayOfNextMonth());
        System.out.println("withTemporalAdjusters firstDayOfNextMonth : "+withTemporalAdjusters2);


    }

}
