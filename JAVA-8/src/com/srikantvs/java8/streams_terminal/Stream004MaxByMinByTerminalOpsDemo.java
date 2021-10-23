package com.srikantvs.java8.streams_terminal;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import com.srikantvs.java8.data.Student;
import com.srikantvs.java8.data.StudentDataBase;

public class Stream004MaxByMinByTerminalOpsDemo {

    public static void main(String[] args) {
        
        /*
         * maxBy: this is used with comparator. it returns the max element 
         * minBy: this is also used with comparator,. It returns the min element.
         * 
         * 
         */
        
        Comparator<Student> studentComparator = (s1, s2)->s1.getName().compareTo(s2.getName());
        
        Optional<Student> smallestName = StudentDataBase.getAllStudents()
                        .stream()
                        .collect(Collectors.minBy(studentComparator));
        
        System.out.println(smallestName.get());
        
        Optional<Student> largestName = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.maxBy(studentComparator));
        
        System.out.println(largestName.get());
        
    }

}
