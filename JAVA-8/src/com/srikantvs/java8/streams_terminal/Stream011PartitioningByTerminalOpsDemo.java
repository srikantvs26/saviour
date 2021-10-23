package com.srikantvs.java8.streams_terminal;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.srikantvs.java8.data.Student;
import com.srikantvs.java8.data.StudentDataBase;

public class Stream011PartitioningByTerminalOpsDemo {

    public static void main(String[] args) {

        // partitioningBy: same as groupingby but its keys are always true and
        // false.
        // takes predicate as input.

        // 2 overloaded methods.
        // partitioningBy(predicate)
        // partitionby(predicate, downstream) : downsteam means aapko kisme
        // collect karna hai.

        // this also returns a map.

        // Names of student, whose gpa>3.0
        // Names of studnet, whose gpa<3.0

        // we can partition the result.

        Map<Boolean, List<Student>> result = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.partitioningBy(s -> s.getGpa() > 3.8));

        System.out.println(result);

        /*
         * {false=[Student{name='Adam', gradeLevel=2, gpa=3.6, gender='male',
         * activities=[swimming, basketball, volleyball]}, Student{name='Jenny',
         * gradeLevel=2, gpa=3.8, gender='female', activities=[swimming,
         * gymnastics, soccer]}, Student{name='Sophia', gradeLevel=4, gpa=3.5,
         * gender='female', activities=[swimming, dancing, football]}],
         * 
         * 
         * true=[Student{name='Emily', gradeLevel=3, gpa=4.0, gender='female',
         * activities=[swimming, gymnastics, aerobics]}, Student{name='Dave',
         * gradeLevel=3, gpa=4.0, gender='male', activities=[swimming,
         * gymnastics, soccer]}, Student{name='James', gradeLevel=4, gpa=3.9,
         * gender='male', activities=[swimming, basketball, baseball,
         * football]}]}
         * 
         */
        
        
        
        // I just want names not student object.
        
        
        
        Map<Boolean, List<String>> result2 = StudentDataBase.getAllStudents()
                                                .stream()
                                                .collect(
                                                        Collectors.partitioningBy(
                                                                student->student.getGpa()>3.8,
                                                                Collectors.mapping(student->student.getName(),Collectors.toList())
                                                                ));
        
        
        
        System.out.println(result2);
    }

}
