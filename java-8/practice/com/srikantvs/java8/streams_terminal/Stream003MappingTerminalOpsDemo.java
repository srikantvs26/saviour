package com.srikantvs.java8.streams_terminal;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.learnJava.data.StudentDataBase;

public class Stream003MappingTerminalOpsDemo {

    public static void main(String[] args) {
        // mapping() collector applies a transformation function and then
        // collects the data
        // in a collection.
        
        
//        mapping(Function, WhatTypeOfCollectionYouWantToStore)
        
        //mapper a function to be applied to the input elements
        //downstream a collector which will accept mapped values
        //

        List<String> studentNames = StudentDataBase.getAllStudents()
                                        .stream()
                                        .collect(Collectors.mapping(student -> student.getName(),Collectors.toList()));

        System.out.println(studentNames);

        Set<String> studentNamesSet = StudentDataBase.getAllStudents()
                                        .stream()
                                        .collect(Collectors.mapping(student -> student.getName(),Collectors.toSet()));

        System.out.println(studentNamesSet);

    }

}
