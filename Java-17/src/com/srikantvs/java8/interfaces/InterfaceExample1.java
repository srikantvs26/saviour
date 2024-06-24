package com.srikantvs.java8.interfaces;

import java.time.LocalDateTime;
import java.time.ZoneId;

public class InterfaceExample1 {


    public static void main(String[] args) {
        
        System.out.println("India time :: "+LocalDateTime.now(ZoneId.of("Asia/Kolkata")));
        System.out.println("Germany time ::"+LocalDateTime.now(ZoneId.of("Europe/Berlin")));

    }

}
