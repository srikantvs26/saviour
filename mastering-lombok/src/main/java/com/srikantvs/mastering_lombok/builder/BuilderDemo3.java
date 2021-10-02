package com.srikantvs.mastering_lombok.builder;

import lombok.Builder;
import lombok.ToString;

public class BuilderDemo3 {

    // @Builder demo with builderMethodName

    @ToString
    @Builder(builderMethodName = "outStupidBuilder", buildMethodName = "letsBuild")
    static class Student{

        private String studentName;
        private String studentAddress;
        private Boolean isPassed;

    }

    public static void main(String[] args) {
        Student student = Student.outStupidBuilder()
                            .studentName("studentName")
                            .studentAddress("blr")
                            .isPassed(true)
                            .letsBuild();

        System.out.println(student);
    }
}
