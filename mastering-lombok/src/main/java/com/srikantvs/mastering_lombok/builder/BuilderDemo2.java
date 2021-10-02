package com.srikantvs.mastering_lombok.builder;

import lombok.Builder;
import lombok.ToString;

public class BuilderDemo2 {

    //@Builder demo with buildMethodName
    @ToString
    @Builder(buildMethodName = "letsBuild")
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
                            .letsBuild();

        System.out.println(student);
    }
}
