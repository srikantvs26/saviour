package com.srikantvs.java8.streams_terminal;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

import com.srikantvs.java8.data.Student;
import com.srikantvs.java8.data.StudentDataBase;

public class Stream009GroupingBy03TerminalOpsDemo {

    public static void main(String[] args) {
        
//        groupingBy(classifier, supplier, downstream)
        
        // we will override map to linkedHashMap.
        
        LinkedHashMap<String,List<Student>> result = StudentDataBase.getAllStudents()
                                                            .stream()
                                                            .collect(
                                                                    Collectors.groupingBy(
                                                                                            s->s.getGender(),
                                                                                            ()->new LinkedHashMap<>(),
                                                                                            Collectors.toList()
                                                                                        )
                                                                    );
        
        System.out.println(result);
        
        TreeMap<String, List<Student>> result1 = StudentDataBase.getAllStudents()
                .stream()
                .collect(
                        Collectors.groupingBy(
                                                s->s.getGender(),
                                                ()->new TreeMap<>(),
                                                Collectors.toList()
                                            )
                        );

        System.out.println(result1);
        
    }

}
