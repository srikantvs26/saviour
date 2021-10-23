package com.srikantvs.java8.itsssstime;

import java.time.Period;

public class DateTime020PeriodDemo {

    public static void main(String[] args) {

        // Period : Period is a date based representation of time in days,
        // months
        // and years and comes in java.time package.

        // It is compatible with LocalDate.

        // It represent a period just specific date
        // eg.
        // Period p1 = Period.ofDays(10);// represent a period of 10 days.

        Period period = Period.ofDays(10);
        Period period2 = Period.ofYears(10);
        Period period3 = Period.ofWeeks(5);
        Period period4 = Period.of(10, 10, 10);// Period of 10 Years, 10 Months
                                               // and 10 days.

        System.out.println("period : " + period);
        System.out.println("period2 : " + period2);
        System.out.println("period3 : " + period3);
        System.out.println("period4 : " + period4);

        
      
        
        
        // period : P10D
        // period2 : P10Y
        // period3 : P35D
        // period4 : P10Y10M10D
        
        // aap kitna bhi days de do ye usko period me convert kar lega.
        // that is why it's period of time. Same duration bhi aisa hi hai
        
        Period pacchinsHazaarDinKaKyaPeriodHai = Period.ofYears(12345);
        System.out.println("pacchinsHazaarDinKaKyaPeriodHai : "+pacchinsHazaarDinKaKyaPeriodHai);

    }

}
