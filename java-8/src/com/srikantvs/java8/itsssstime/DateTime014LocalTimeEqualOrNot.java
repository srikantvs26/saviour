package com.srikantvs.java8.itsssstime;

import java.time.LocalTime;

public class DateTime014LocalTimeEqualOrNot {

    public static void main(String[] args) {

        // isEquals method is not there.

        LocalTime localTime2 = LocalTime.now().withHour(13);
        LocalTime localTime3 = LocalTime.now().withHour(14);
        if (localTime2.equals(localTime3)) {
            System.out.println("Both time are equal");
        } else {
            System.out.println("both time are not equal");
        }

        //-----------------------------------------------------------

        LocalTime localTime4 = LocalTime.now();
        LocalTime localTime5 = LocalTime.now();
        if (localTime4.equals(localTime5)) {
            System.out.println("Both time are equal");
        } else {
            System.out.println("both time are not equal");
        }

    }

}
