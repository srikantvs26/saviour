package com.srikantvs.java8;

import java.net.URI;
import java.nio.file.FileSystems;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        // LocalDateTime dateTime = LocalDateTime.now();
        LocalDate localDate = LocalDate.of(2019, 2, 28);
        LocalDateTime ldDayEnd = localDate.atTime(LocalTime.MAX);
        System.out.println(ldDayEnd);
        // dateTime.atTime;
        // LocalDate.attime
        // LocalDateTime ldDayEnd = dateTime.atTime(LocalTime.MAX);
        URI uri = FileSystems.getDefault().getPath(System.getProperty("user.dir")).toUri();
        System.out.println(uri);
        // FileSystems.getFileSystem(uri);

         URI uri2 = Paths.get("App.java").toUri();
         System.out.println(uri2);
        System.out.println(FileSystems.getFileSystem(uri2));
        
    }
}
