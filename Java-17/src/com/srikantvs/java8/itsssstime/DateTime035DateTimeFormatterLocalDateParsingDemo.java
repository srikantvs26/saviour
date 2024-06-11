package com.srikantvs.java8.itsssstime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTime035DateTimeFormatterLocalDateParsingDemo {

    public static void main(String[] args) {


        // DateTimeFormatter is introduced in java 8 
        // java.time.format

        // it can parse LocalDate, LocalTime, LocalDateTime


        // What is difference between parsing and formatting?

        // parsing : Converting a String to LocalDate/LocalTime/LocalDateTime.
        // formatting : Converting a LocalDate/LocalTime/LocalDateTime to String.



        //parsing.
        String date = "22/10/2021";
        System.out.println("Indian Date Format : "+date);
        DateTimeFormatter formatter  = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate localDate = LocalDate.parse(date, formatter);
        System.out.println("American Date Format : "+localDate);

        //parsing v2.
        String date1 = "2021-10-22";//already in ISO_LOCAL_DATE
        System.out.println("date1 : "+date1);
        LocalDate localDate2 = LocalDate.parse(date1);// by default used ISO_LOCAL_DATE
        System.out.println("American Date Format : "+localDate2);

        //parsing v3.
        String date2 = "20211022";
        System.out.println("date2: "+date2);
        LocalDate localDate3 = LocalDate.parse(date2, DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println("localDate3 : "+localDate3);


    }





}
