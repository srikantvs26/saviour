package com.srikantvs.java8.methodreferences;

import java.security.SecureRandom;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

import com.srikantvs.java8.data.Student;
import com.srikantvs.java8.data.StudentDataBase;

public class MethodReference004Demo {

    public static void main(String[] args) {
        
        //Constructor Reference
        // (a,b)->new ClassName(a,b) --> Class::new
        
        Function<String, Student> studentFunction = name->new Student(name);
        Function<String, Student> studentMR= Student::new;
        
        Student student1 = studentFunction.apply("green");
        System.out.println(student1);
        Student student2 = studentMR.apply("green");
        System.out.println(student2);
        
        //------------------------------------------------------------------
        
        Supplier<Student> studentSupplier = Student::new; //Ok
       // Student s1 = Student::new; //CE The target type of this expression must be a functional interface
        
    }

}
