package com.srikantvs.java8.defaultstaticmethods;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class DefaultMethods002WithStudentsDemo {

    public static void main(String[] args) {
        
        Comparator<Student> studentComparator = (s1,s2)->s1.getName().compareTo(s2.getName());
        Comparator<Student> studentComparator1 = Comparator.comparing(student->student.getName());
        Comparator<Student> studentGradeComparator = Comparator.comparingInt(student->student.getGradeLevel());// here reserved was not working
        List<Student> allStudents = StudentDataBase.getAllStudents();
        allStudents.sort(studentGradeComparator.reversed());// here reserved is working
        
        System.out.println(allStudents);
        
        
        // learn about comparator Chaining.
        
        
        
        

    }

}
