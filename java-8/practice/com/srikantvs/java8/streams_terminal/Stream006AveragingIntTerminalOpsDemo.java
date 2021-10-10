package com.srikantvs.java8.streams_terminal;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class Stream006AveragingIntTerminalOpsDemo {

    public static void main(String[] args) {
        //averagingInt : this collector returns the average of the result
        
        
        // average grade.
        
        Double averageGrade = StudentDataBase.getAllStudents()
                                .stream()
                                .collect(Collectors.averagingInt(student->student.getGradeLevel()));
        
        System.out.println(averageGrade);
        
        
        
        
        
        
        
    }

}
