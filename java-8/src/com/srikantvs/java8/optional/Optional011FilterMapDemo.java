package com.srikantvs.java8.optional;

import java.util.Arrays;
import java.util.Optional;

import com.srikantvs.java8.data.Student;

public class Optional011FilterMapDemo {

    public static void main(String[] args) {
        
        //filter
        //map
        //flatmap
        
        
        Student student1 = new Student("Adam",2,3.6, "male",10,Arrays.asList("swimming", "basketball","volleyball"));

        Optional<Student> studentOptional = Optional.ofNullable(student1);
        studentOptional.filter(student->student.getGender().equals("male"))
                        .map(student->student.getName())
                        .ifPresent(studentName->System.out.println(studentName));
    }

}
