package com.srikantvs.java8.streams;

import java.util.Optional;

import com.srikantvs.java8.data.Student;
import com.srikantvs.java8.data.StudentDataBase;

public class Streams11FindFirstAnyDemo {

    public static void main(String[] args) {

        /*
         * findFirst and findAny method is used to find an element from stream to work with. both return optional object.
         * findFirst : find the first element for us.
         * findAny : find any element for us.
         */

        Optional<Student> student1 = StudentDataBase.getAllStudents().stream()
                .findAny();

        student1.ifPresent(student -> System.out.println(student));

        Optional<Student> student2 = StudentDataBase.getAllStudents().stream()
                .findFirst();

        student2.ifPresent(student -> System.out.println(student));


    }

}
