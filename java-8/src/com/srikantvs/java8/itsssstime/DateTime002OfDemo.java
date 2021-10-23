package com.srikantvs.java8.itsssstime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class DateTime002OfDemo {

    public static void main(String[] args) {

        LocalDate localDate1 = LocalDate.of(2021, 10, 21);
        System.out.println("LocalDate1 : " + localDate1);
        
        LocalDate localDate3 = LocalDate.of(2021, Month.OCTOBER, 21);
        System.out.println("LocalDate3 : "+localDate3);

        LocalDate localDate2 = LocalDate.ofYearDay(2021, 365);//last day of the year.
        System.out.println("LocalDate2 : "+localDate2);
        

    }

}
