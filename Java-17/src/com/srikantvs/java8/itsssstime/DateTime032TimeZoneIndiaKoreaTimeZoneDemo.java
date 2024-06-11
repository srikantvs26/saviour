package com.srikantvs.java8.itsssstime;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateTime032TimeZoneIndiaKoreaTimeZoneDemo {

    public static void main(String[] args) {

        ZonedDateTime ist = Instant.now().atZone(ZoneId.of("Asia/Calcutta"));
        ZonedDateTime kst = Instant.now().atZone(ZoneId.of("Asia/Seoul"));

        System.out.println("ist : "+ist);
        System.out.println("kst : "+kst);

    }

}
