package com.srikantvs.java8.streams;

import java.util.List;
import java.util.stream.Collectors;

import com.srikantvs.java8.data.Student;
import com.srikantvs.java8.data.StudentDataBase;

public class Streams05FilterDemo {

    public static void main(String[] args) {

        // filter : this method is used to filter the elements of the stream.
        // it takes predicate as an input to filter the elements of stream.

        // use case : I want only female students.

        List<Student> femaleStudentList = StudentDataBase.getAllStudents()
                .stream()
                .filter(eachStudent -> eachStudent.getGender().equalsIgnoreCase(
                        "female") && eachStudent.getGpa() >= 3.9)
                .collect(Collectors.toList());

        System.out.println(femaleStudentList);

    }

}
