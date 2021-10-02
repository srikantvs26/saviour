package com.srikantvs.java8.streams_terminal;

import java.util.stream.Collectors;

import com.srikantvs.java8.data.StudentDataBase;

public class Stream001JoiningTerminalOpsDemo {

    public static void main(String[] args) {

        /*
         * Terminals Operations collect the data for us.
         * Terminal operations starts the whole stream pipeline.
         * because as we know streams are lazy. So we need terminal
         * Operations to start them.
         * 
         * eg. forEach
         * min
         * max
         * count etc.
         * collect
         */

        // eg. collect() : 
        // It takes an input of type Collectors and produces the result based on it.

        // 1. joining() : it will do string concatenation on all the string elements.

        String res1 = StudentDataBase.getAllStudents()
                .stream()
                .map(student->student.getName())
                .collect(Collectors.joining());

        System.out.println(res1);


        String res2 = StudentDataBase.getAllStudents()
                .stream()
                .map(student->student.getName())
                .collect(Collectors.joining(", "));

        System.out.println(res2);


        String res3 = StudentDataBase.getAllStudents()
                .stream()
                .map(student->student.getName())
                .collect(Collectors.joining(", ","{","}"));

        System.out.println(res3);

        //Output: 

        //        AdamJennyEmilyDaveSophiaJames
        //        Adam, Jenny, Emily, Dave, Sophia, James
        //        {Adam, Jenny, Emily, Dave, Sophia, James}


    }

}
