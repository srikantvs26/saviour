package com.srikantvs.java8.streams_terminal;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class Stream008GroupingBy02TerminalOpsDemo {

    public static void main(String[] args) {
        
        //groupingBy(classifier, downstream)
        
        // usecase : how many female and males students are there
        
        
        Map<String, Long> result1 = StudentDataBase.getAllStudents()
                        .stream()
                        .collect(Collectors.groupingBy(student->student.getGender(), Collectors.counting()));
        
        System.out.println(result1);
        
        //usecase : count of notebooks each gender is having.
        
        
        Map<String, Integer> result2 = StudentDataBase.getAllStudents()
                        .stream()
                        .collect(Collectors.groupingBy(student->student.getGender(), Collectors.summingInt(student->student.getNoteBooks())));
        
        System.out.println(result2);
        
        //usecase : how many notebooks each student is having.
        
        Map<String, Integer> result3 = StudentDataBase.getAllStudents()
            .stream()
            .collect(Collectors.groupingBy(student->student.getName(), Collectors.summingInt(student->student.getNoteBooks())));
        
        System.out.println(result3);
        
        
       
        // use case. I want student names along with their gender.
        Map<String, List<String>> genderWithNames = StudentDataBase.getAllStudents()
                                                            .stream()
                                                            .collect(Collectors.groupingBy(student->student.getGender(),Collectors.mapping(student->student.getName(), Collectors.toList())));
                                            
        System.out.println(genderWithNames);
        
        // use case. I want student names along with their gender.
        Map<String, String> genderWithNames2 = StudentDataBase.getAllStudents()
                                                            .stream()
                                                            .collect(Collectors.groupingBy(student->student.getGender(),Collectors.mapping(student->student.getName(), Collectors.joining(", "))));
                                            
        System.out.println(genderWithNames2);
        
    }

}
