package com.srikantvs.mastering_lombok.builder;

import lombok.Builder;
import lombok.ToString;

public class BuilderDemo1 {

    // simple @Builder Demo
    @ToString
    @Builder
    static class Student{

        private String studentName;
        private String studentAddress;
        private Boolean isPassed;

    }

    public static void main(String[] args) {
        Student student = Student.builder()
                            .studentName("studentName")
                            .studentAddress("blr")
                            .isPassed(true)
                            .build();

        System.out.println(student);
    }
}
