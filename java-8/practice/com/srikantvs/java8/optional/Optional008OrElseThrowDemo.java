package com.srikantvs.java8.optional;

import java.util.Arrays;
import java.util.Optional;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class Optional008OrElseThrowDemo {

    public static void main(String[] args) {

        // //methods are spread out so we have to find out where we can apply
        // what method.

        String adam = StudentDataBase.getAllStudents()
                .stream()
                .map(student -> student.getName())
                .filter(name -> name.equalsIgnoreCase("adam")).findFirst()
                .orElseThrow(() -> new RuntimeException("Nada!"));

        System.out.println(adam);

        String sofffffffffhia = StudentDataBase.getAllStudents()
                .stream()
                .map(student -> student.getName())
                .filter(name -> name.equalsIgnoreCase("soffffffffffia"))
                .findFirst().orElseGet(() -> "Sofia");

        System.out.println(sofffffffffhia);

        // lly for orElse as well.
    }

}
