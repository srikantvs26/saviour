package com.srikantvs.java8.parallelstreams;

import java.util.List;
import java.util.stream.Collectors;

import com.srikantvs.java8.data.StudentDataBase;

public class ParallelStream004ParallelPipelineDemo {

    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();
        
        List<String> uniqueStudentActivities2 = StudentDataBase.getAllStudents()
                                                        .parallelStream()//----------------> See this on list itself we are getting parallelStream
                                                        .map(eachStudent -> eachStudent.getActivities())
                                                        .flatMap(takeThatStudentList -> takeThatStudentList.stream())
                                                        .distinct()
                                                        .sorted()
                                                        .collect(Collectors.toList());
        long endTime = System.currentTimeMillis();
        System.out.println(uniqueStudentActivities2);
        System.out.println("Time Taken : "+(endTime-startTime));
        
        long startTimeu = System.currentTimeMillis();
        
        List<String> uniqueStudentActivities = StudentDataBase.getAllStudents()
                                                        .stream()
                                                        .parallel()//----------------> See this. on Stream we have called Parallel
                                                        .map(eachStudent -> eachStudent.getActivities())
                                                        .flatMap(takeThatStudentList -> takeThatStudentList.stream())
                                                        .distinct()
                                                        .sorted()
                                                        .collect(Collectors.toList());
        long endTimeu = System.currentTimeMillis();
        System.out.println(uniqueStudentActivities);
        System.out.println("Time Taken : "+(endTimeu-startTimeu));
        
        
//        output
//        [aerobics, baseball, basketball, dancing, football, gymnastics, soccer, swimming, volleyball]
//        Time Taken : 150
//        [aerobics, baseball, basketball, dancing, football, gymnastics, soccer, swimming, volleyball]
//        Time Taken : 2
//        
//        Why there is so much time difference ? : Run them individually. there will be no difference. wo ek baar already calculate kar chuka hai na isliye 2nd wale me time kam aa raha hai.
        
//        parallelStream() : Returns a possibly parallel Stream with this collection as itssource. 
//        ########It is allowable for this method to return a sequential stream.##################
        
//        parallel(): Returns an equivalent stream that is parallel. May return itself, 
//        either because the stream was already parallel, 
//        or because the underlying stream state was modified to be parallel. 
        
//        I would recommend 2nd one. parallel() method.

    }

}
