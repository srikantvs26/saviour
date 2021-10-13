package com.srikantvs.java8.streams_terminal;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class Stream005SummingIntTerminalOpsDemo {

    public static void main(String[] args) {
        //summingInt() : this collectors returns the sum as result.
        
        
        // total marks of all students.
        
       Double totalMarks = StudentDataBase.getAllStudents()
                                .stream()
                                .collect(Collectors.summingDouble(student->student.getGpa()));
        
       System.out.println(totalMarks);
       
       // lly aap summingInt ka bhi kar sakte ho.
        
        
        
        
        
        
        
    }

}
