package com.srikantvs.java8.itsssstime;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class DateTime023DurationDemo {

    public static void main(String[] args) {

        // Duration : It is a time based representation of time in hours,
        // minutes seconds and nano seconds

        // Compatible with LocalDateTime and LocalTime ONLY

        // It represents a duration of time, not just specific time.
        // eg.

        Duration duration = Duration.ofHours(5);//duration of 5 hours.
        System.out.println("duration : "+duration);

        Duration duration2 = Duration.ofDays(5);
        System.out.println("duration2 : "+duration2);

        Duration duration3 = Duration.ofDays(100);
        System.out.println("duration3 : "+duration3);

        Duration duration4 = Duration.of(5555, ChronoUnit.MINUTES);
        System.out.println("duration4 : "+duration4);// PT92H35M

        Duration duration5 = Duration.ofMillis(1000);
        System.out.println("duration5 : "+duration5);

        Duration duration6 = Duration.of(84300, ChronoUnit.SECONDS);
        System.out.println("duration6 : "+duration6);//duration6 : PT23H25M


        // This is what It is a time based representation of time means.

        // aap koi bhi duration de do ye usko hours minutes me kar lega.


        //        duration : PT5H
        //        duration2 : PT120H
        //        duration3 : PT2400H
        //        duration4 : PT92H35M
        //        duration5 : PT1S --> sirf 1 second ka duration.
        //        duration6 : PT23H25M
    }

}
