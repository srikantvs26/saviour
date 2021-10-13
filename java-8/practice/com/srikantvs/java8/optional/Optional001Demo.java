package com.srikantvs.java8.optional;

import java.util.Optional;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class Optional001Demo {
    public static void main(String[] args) {

        Optional<Student> optionalStudent = StudentDataBase.getOptionalStudent();
        System.out.println(optionalStudent.get().getName().length());
        
        
    }
}
