package com.srikantvs.java8.streams;

import java.util.List;

import com.srikantvs.java8.data.StudentDataBase;

public class Streams13ToListMethodDemo {
    public static void main(String[] args) {
        List<String> activities = StudentDataBase.getAllStudents()
                .stream()
                .flatMap(student -> student.getActivities().stream())
                .toList();
        System.out.println(activities);
    }
}