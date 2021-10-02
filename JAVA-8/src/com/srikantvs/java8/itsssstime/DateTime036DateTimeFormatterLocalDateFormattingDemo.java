package com.srikantvs.java8.itsssstime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTime036DateTimeFormatterLocalDateFormattingDemo {

    public static void main(String[] args) {

        // formatting : Converting a LocalDate/LocalTime/LocalDateTime to String.

        //formatting 1.
        
        LocalDate localDate = LocalDate.now();
        String dateFormat1 = localDate.format(DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println("localDate : "+localDate);//2021-10-22
        System.out.println("dateFormat1 : "+dateFormat1);//20211022

        // formatting 2.
        LocalDate localDate2 = LocalDate.now();//2021-10-22
        String dateFormat2 = localDate2.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println("localDate2 : "+localDate2);
        System.out.println("dateFormat2 : "+dateFormat2);// 22/10/2021

        // Pattern includes reserved character: '#'
        // # is reserved character.
        // String dateFormat3 = localDate2.format(DateTimeFormatter.ofPattern("dd#MM#yyyy"));
        
    }





}
