package com.srikantvs.mastering_lombok.builder;

import com.srikantvs.mastering_lombok.builder.BuilderDemo4.Student.StudentBuilderXX;

import lombok.Builder;
import lombok.ToString;

public class BuilderDemo4 {

    //@Builder demo with builderClassName

    @ToString
    @Builder(builderClassName = "StudentBuilderXX")
    static class Student {

        private String studentName;
        private String studentAddress;
        private Boolean isPassed;

    }

    public static void main(String[] args) {
        StudentBuilderXX studentBuilder = Student.builder();
        Student student = studentBuilder.studentName("Rhea")
                                        .studentAddress("USA")
                                        .isPassed(true)
                                        .build();

        System.out.println(student);
    }
}
