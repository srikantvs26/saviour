package com.srikantvs.java8.string_enhancements_java11;

import java.util.List;

public class StringEnhancementsDemo {

    public static void main(String[] args) {

        // repeat()
        String greeting = "hello";
        String greeting5x = greeting.repeat(5);
        System.out.println("repeat() :: " + greeting5x);

        // strip()
        String stripMe = "\n\t wow                       ";
        System.out.println("Before stripping :: " + stripMe);
        System.out.println("strip() :: " + stripMe.strip());

        // stripLeading()
        System.out.println("stripLeading() :: " + stripMe.stripLeading());

        // stripTrailing()
        System.out.println("stripTrailing() :: " + stripMe.stripTrailing());

        // isBlank()
        System.out.println("isBlank() :: " + "".isBlank());
        System.out.println("isBlank() :: " + "\t\t\t\t\t\n".isBlank());
        System.out.println("isBlank() :: " + "\n           ".isBlank());
        System.out.println("isBlank() :: " + "HELLO".isBlank());

        // lines() alternative for split metho
        String para = "apple\nball\ncat\ndog\nelephant\nnilgai";
        List<String> wordsWithA = para.lines().filter(name->name.contains("a")).toList();
        System.out.println(wordsWithA);

    }

}
