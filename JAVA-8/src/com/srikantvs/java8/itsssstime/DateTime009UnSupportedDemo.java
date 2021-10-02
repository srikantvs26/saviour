package com.srikantvs.java8.itsssstime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class DateTime009UnSupportedDemo {

    public static void main(String[] args) {

        // suppose we have a LocalDate, We know it only contains date.
        // now if we add or subtract time related units we will
        // get exception.

        LocalDate localDate = LocalDate.now();// 2021-10-21

        // lets add seconds to this date.

        // LocalDate localDate2 = localDate.plus(4,ChronoUnit.SECONDS);//java.time.temporal.UnsupportedTemporalTypeException:Unsupported unit: Seconds



        // so we can check if a particular unit to be added or subtracted is supported or not.

        boolean supported = localDate.isSupported(ChronoUnit.SECONDS);
        System.out.println(supported);//false.


        LocalTime localTime = LocalTime.now();
        boolean supported2 = localTime.isSupported(ChronoUnit.SECONDS);
        System.out.println(supported2);



    }

}
