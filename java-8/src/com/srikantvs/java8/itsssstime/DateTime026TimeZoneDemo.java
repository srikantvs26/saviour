package com.srikantvs.java8.itsssstime;

import java.time.Clock;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class DateTime026TimeZoneDemo {

    public static void main(String[] args) {

        // ZonedDateTime : it represents date/time with its time zone.
        
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println("zonedDateTime : "+zonedDateTime);//2021-10-22T12:40:02.607+05:30[Asia/Calcutta]

        //+05:30 : ZoneOffset
        // Asia/Calcutta : ZoneId
        
        System.out.println("getZoneId : "+zonedDateTime.getZone());
        System.out.println("getOffset : "+zonedDateTime.getOffset());
        
        // Creating ZonedDateTime with our own ZoneId.
        // Identify your zone first.
        
        ZonedDateTime zonedDateTime2 = ZonedDateTime.now(ZoneId.of("Asia/Calcutta"));
        System.out.println("Time In India : " +zonedDateTime2);
        
        ZonedDateTime zonedDateTime3 = ZonedDateTime.now(ZoneId.ofOffset("GMT", ZoneOffset.of("+05:00")));
        System.out.println("Time In Pakistan : "+zonedDateTime3);
        
        
        ZonedDateTime zonedDateTime4 = ZonedDateTime.now(Clock.system(ZoneId.of("Asia/Seoul")));
        System.out.println("Time in Korea : "+zonedDateTime4);
        
        
        
        
    }

}
