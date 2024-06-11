package com.srikantvs.java8.streams_terminal;

import java.util.stream.Collectors;

import com.srikantvs.java8.data.StudentDataBase;

public class Stream006AveragingIntTerminalOpsDemo {

    public static void main(String[] args) {
        // averagingInt : this collector returns the average of the result

        // average grade.

        Double averageGrade = StudentDataBase.getAllStudents().stream().collect(
                Collectors.averagingInt(student -> student.getGradeLevel()));

        System.out.println(averageGrade);

    }

}
