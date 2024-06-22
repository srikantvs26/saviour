package com.srikantvs.java8.streams_terminal;

import java.util.List;
import java.util.stream.Collectors;

import com.srikantvs.java8.data.Student;
import com.srikantvs.java8.data.StudentDataBase;

public class StreamsToListDemo {
    public static void main(String[] args) {

        List<String> modifiableList = StudentDataBase.getAllStudents()
                .stream()
                .map(student -> student.getName())
                .collect(Collectors.toList());

        modifiableList.add("Eve");
        System.out.println(modifiableList);
        List<String> unmodifiableList= StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getName)
                .toList();

        unmodifiableList.add("Eve"); // java.lang.UnsupportedOperationException
        System.out.println(unmodifiableList);


    }

}
