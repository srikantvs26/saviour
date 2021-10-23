package com.srikantvs.java8.itsssstime;

import java.sql.Date;
import java.time.LocalDate;

public class DateTime034SQLDateToLocalDateDemo {

    public static void main(String[] args) {

        // LocalDate to SQL Date.

        LocalDate localDate = LocalDate.now();
        System.out.println("LocalDate : "+localDate);
        Date date = Date.valueOf(localDate);
        System.out.println("SQL Date: "+date);


        // SQL Date to Local Date
        Date date2 = new Date(2021, 10, 22);//ye deprecated hai SQL Date me.
        Date date3 = new Date(new java.util.Date().getTime());
        System.out.println("SQL Date : "+date3);

        LocalDate localDate2 = date3.toLocalDate();
        System.out.println("LocalDate : "+localDate2);


    }

}
