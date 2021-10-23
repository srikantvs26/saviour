package com.srikantvs.java8.itsssstime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTime020ConverstionLDLTToLDTAtTimeDemo {

    public static void main(String[] args) {
        //------------------local date to local date time ------------------
        LocalDate localDate = LocalDate.now();
        System.out.println("localDate : "+localDate);
        LocalDateTime localDateTime = localDate.atTime(12, 58);
        System.out.println("localDateTime : "+localDateTime);
        
        //-------------------local time to local date time------------------
        LocalTime localTime = LocalTime.now();
        System.out.println("localTime : "+localTime);
        LocalDate date= LocalDate.now();
        LocalDateTime atDate = localTime.atDate(date);
        System.out.println("atDate : "+atDate);
        
        //-------------- local date time to local date----------------------
        LocalDateTime localDateTime2 = LocalDateTime.now();
        System.out.println("localDateTime2 : "+localDateTime2);
        
        System.out.println("local date time to local date : "+localDateTime2.toLocalDate());
        System.out.println("local date time to local time : "+localDateTime2.toLocalTime());
    }

}
