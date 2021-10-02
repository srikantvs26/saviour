package com.srikantvs.java8.streams;

import com.learnJava.data.StudentDataBase;

public class Streams07MapReduceDemo {

    public static void main(String[] args) {

        // this is a classic example of map filter and reduce pattern

        String studentWithBiggestName = StudentDataBase.getAllStudents()
                                                .stream()
                                                .filter(student -> student.getGradeLevel() >= 3)
                                                .filter(student -> student.getGender().equalsIgnoreCase("female"))
                                                .map(eachStudent -> eachStudent.getName())
                                                .reduce("hello", (name1, name2) -> {
                                                    if (name1.length() > name2.length())
                                                        return name1;
                                                    else
                                                        return name2;

                                                });

        System.out.println(studentWithBiggestName);

    }

}
