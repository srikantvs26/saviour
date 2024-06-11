package com.srikantvs.java8.itsssstime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTime019LocalDateTimeModifyingDemo {

    public static void main(String[] args) {


        LocalDateTime localDateTime3 = LocalDateTime.of(LocalDate.now(), LocalTime.now());
        System.out.println("localDateTime3 : "+localDateTime3);


        System.out.println("minusHours 2 : "+localDateTime3.minusHours(2));
        // Same like before many more both LocalDate and LocalTime methods will be applicable.

        // with

        System.out.println("withHour 14 : "+localDateTime3.withHour(14));

    }

}
