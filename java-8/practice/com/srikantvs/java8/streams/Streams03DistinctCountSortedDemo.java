package com.srikantvs.java8.streams;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.learnJava.data.StudentDataBase;

public class Streams03DistinctCountSortedDemo {

    public static void main(String[] args) {

        // 	distinct : uniques values form the stream.
        // count : total values in the stream
        // sorted : alphabetical sorting of the stream elements.
        List<String> uniqueStudentActivities2 = StudentDataBase.getAllStudents()
                                                                .stream()
                                                                .map(eachStudent -> eachStudent.getActivities())//Stream<List<String>>
                                                                .flatMap(takeThatStudentList -> takeThatStudentList.stream())// here. it will become <Stream<Stream<String>> but with that flatmap one stream will be gone so we will be end up with just Stream<String>
                                                                .distinct()
                                                                .sorted()
                                                                .collect(Collectors.toList());

        System.out.println(uniqueStudentActivities2);



        //		

        long distinctActivitiesCount = StudentDataBase.getAllStudents()
                                                        .stream()
                                                        .map(eachStudent -> eachStudent.getActivities())//Stream<List<String>>
                                                        .flatMap(takeThatStudentList -> takeThatStudentList.stream())// here. it will become <Stream<Stream<String>> but with that flatmap one stream will be gone so we will be end up with just Stream<String>
                                                        .distinct()
                                                        .sorted()
                                                        .count();

        System.out.println(distinctActivitiesCount);






    }



}
