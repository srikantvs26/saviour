package com.srikantvs.java8.streams_terminal;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import com.srikantvs.java8.data.Student;
import com.srikantvs.java8.data.StudentDataBase;

public class Stream010UseCaseCollectingAndThenTerminalOpsDemo {

    public static void main(String[] args) {

        //        usecase : top grade student in each grade.


        Map<Integer, Optional<Student>> result1 = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(
                        student->student.getGradeLevel(),
                        Collectors.maxBy(Comparator.comparingDouble(student->student.getGpa()))));



        System.out.println(result1);

        // We can see that value is Optional we can avoid this by applying
        // final transfomations.


        // as maxBy returns Optional so we can apply transformation on optional.

        Map<Integer, Student> result2 = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(
                        student->student.getGradeLevel(),
                        Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingDouble(student->student.getGpa())),s->s.get())));



        System.out.println(result2);
        //method reference version.
        Map<Integer, Student> result3 = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(
                        student->student.getGradeLevel(),
                        Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingDouble(student->student.getGpa())),Optional::get)));



        System.out.println(result3);




        // collectingandthen another example.


        List<String> studentNamesList = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.collectingAndThen(
                        Collectors.mapping(s->s.getName(), Collectors.toList()), studentList->Collections.unmodifiableList(studentList))
                        );
        // studentNamesList.add("hi"); Exception. unmodifiable list.

        System.out.println(studentNamesList);


        //  collectingAndThen ye method lagane k liye pehle ye dekho ki method kya return kar raha hai.
        // yaha pe hum log StudentList return kar rahe hai. to final transformation jo lagega wo
        // isi list pe lagega. so list->collection.unfomodifiablelist(list)



    }

}
