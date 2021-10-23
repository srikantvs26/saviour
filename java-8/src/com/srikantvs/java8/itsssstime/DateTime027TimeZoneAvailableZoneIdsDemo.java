package com.srikantvs.java8.itsssstime;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Set;

public class DateTime027TimeZoneAvailableZoneIdsDemo {

    public static void main(String[] args) {
        // what all zones are available.
        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
        availableZoneIds.forEach(zone->System.out.println(zone));
        

        Set<String> availableZoneIds1 = ZoneOffset.getAvailableZoneIds();
        System.out.println(availableZoneIds1);
    }

}
