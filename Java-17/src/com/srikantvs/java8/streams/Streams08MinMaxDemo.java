package com.srikantvs.java8.streams;

import java.util.Optional;

import com.srikantvs.java8.data.StudentDataBase;

public class Streams08MinMaxDemo {

    public static void main(String[] args) {

        // use case : find out the minimum and maximum grade of students using
        // min and max methods.

        // when working with integers we should not use default value of 0, 1
        // etc because if
        // the list is empty then that default value don't give correct
        // perception.
        // so use optional varient of it.

        Optional<Integer> maxGrade = StudentDataBase.getAllStudents().stream()
                .map(student -> student.getGradeLevel())
                .reduce((grade1, grade2) -> Integer.max(grade1, grade2));

        maxGrade.ifPresent(grade -> System.out.println(grade));

        Optional<Integer> minGrade = StudentDataBase.getAllStudents().stream()
                .map(student -> student.getGradeLevel())
                .reduce((grade1, grade2) -> Integer.min(grade1, grade2));

        minGrade.ifPresent(grade -> System.out.println(grade));

        // Arrays.asList(1,2,3,5,6).stream(); --> we can find min max the same
        // for this as well.

    }

}
