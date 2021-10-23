package com.srikantvs.java8.itsssstime;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class DateTime016LocalTimeUnsupportedDemo {

    public static void main(String[] args) {

        LocalTime localTime = LocalTime.now();
        boolean supported2 = localTime.isSupported(ChronoUnit.SECONDS);
        System.out.println(supported2);//true

        boolean supported = localTime.isSupported(ChronoUnit.DAYS);
        System.out.println(supported);//false

    }

}
