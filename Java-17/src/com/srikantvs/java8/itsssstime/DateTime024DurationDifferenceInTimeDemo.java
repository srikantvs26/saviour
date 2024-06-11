package com.srikantvs.java8.itsssstime;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class DateTime024DurationDifferenceInTimeDemo {

    public static void main(String[] args) {

        // DateTime013LocalTimeUtilDemo.java -> Check this file as well.

        LocalTime localTimeMidNight = LocalTime.MIDNIGHT;
        LocalTime localTimeNoon = LocalTime.NOON;
        Duration between = Duration.between(localTimeMidNight, localTimeNoon);

        System.out.println("Number of seconds : " + between.getSeconds());
        System.out.println("Number of hours : " + between.toHours());// notice to here.
        System.out.println("Number of minutes : " + between.toMinutes());

        // Number of seconds : 43200
        // Number of hours : 12
        // Number of minutes : 720
        
        // until() method is also there.
        long totalMinutes = localTimeMidNight.until(localTimeNoon, ChronoUnit.MINUTES);
        System.out.println("No. of Minutes : "+totalMinutes);

    }

}
