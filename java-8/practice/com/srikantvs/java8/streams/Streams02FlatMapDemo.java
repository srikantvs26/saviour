package com.srikantvs.java8.streams;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.learnJava.data.StudentDataBase;

public class Streams02FlatMapDemo {

    public static void main(String[] args) {

        //		flatmap() : just like map it is used to transform the stream from one type to another
        //		 			but this is good when we have to flatten the stream . flatten means.

        //					Stream<Stream<String>> --> Stream<String>



        //		use case : I want to get all the activities of students.
        List<String> studentActivities = StudentDataBase.getAllStudents()
                                                        .stream()
                                                        .map(eachStudent -> eachStudent.getActivities())//Stream<List<String>>
                                                        .flatMap(takeThatStudentList -> takeThatStudentList.stream())// here. it will become <Stream<Stream<String>> but with that flatmap one stream will be gone so we will be end up with just Stream<String>
                                                        .collect(Collectors.toList());

        System.out.println(studentActivities);


        //		usecase : I want student activities which are unique.

        Set<String> uniqueStudentActivities = StudentDataBase.getAllStudents()
                                                                .stream()
                                                                .map(eachStudent -> eachStudent.getActivities())//Stream<List<String>>
                                                                .flatMap(takeThatStudentList -> takeThatStudentList.stream())// here. it will become <Stream<Stream<String>> but with that flatmap one stream will be gone so we will be end up with just Stream<String>
                                                                .collect(Collectors.toSet());

        System.out.println(uniqueStudentActivities);

        List<String> uniqueStudentActivities2 = StudentDataBase.getAllStudents()
                                                                .stream()
                                                                .map(eachStudent -> eachStudent.getActivities())//Stream<List<String>>
                                                                .flatMap(takeThatStudentList -> takeThatStudentList.stream())// here. it will become <Stream<Stream<String>> but with that flatmap one stream will be gone so we will be end up with just Stream<String>
                                                                .distinct()
                                                                .sorted()
                                                                .collect(Collectors.toList());

        System.out.println(uniqueStudentActivities2);
        







    }



}
