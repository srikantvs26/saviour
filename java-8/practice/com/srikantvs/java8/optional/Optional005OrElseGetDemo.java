package com.srikantvs.java8.optional;

import java.util.Arrays;
import java.util.Optional;

import com.learnJava.data.Student;

public class Optional005OrElseGetDemo {
    
    private static String getStudentName(Student student1) {
        String studentName = Optional.of(student1)
                                     .map(singleStudent->singleStudent.getName())
                                     .orElseGet(()->"John Doe");
        return studentName;
    }
    
    public static void main(String[] args) {
        
        //orElseGet example.
        // orElseGet takes a supplier.
        
        Student student1 = new Student("Adam",2,3.6, "male",10,Arrays.asList("swimming", "basketball","volleyball"));

        // Now I want this student Name if name is not there I want name as John Doe.
        
        String studentName = getStudentName(student1);
        System.out.println(studentName);
        
        student1.setName(null);// Now we are passing name as null
        String studentName2 = getStudentName(student1);
        System.out.println(studentName2);
        
    }

   
}
