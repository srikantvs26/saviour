package com.srikantvs.java8.usecases;

import com.learnJava.data.StudentDataBase;

public class Usecase3 {
    
    public static void main(String[] args) {
        
        //Solid Example for flatMap
        
        long swimmingHobiesCount = StudentDataBase.getAllStudents()
                .stream()
                .flatMap(student->student.getActivities().stream())
                .filter("swimming"::equalsIgnoreCase)
                .count();

        System.out.println(swimmingHobiesCount);

        
    }

}
