package com.srikantvs.java8.usecases;

import java.util.Map;
import java.util.stream.Collectors;

public class Usecase2 {

    public static void main(String[] args) {
        
        
        String sentence = "I love Jjjjjava";
        // count the frequency of each letter.
        Map<Character, Long> frequency = sentence.chars()
                                                 .mapToObj(eachChar->(char)eachChar)
                                                 .filter(eachCharacter->!Character.isWhitespace(eachCharacter))
                                                 .map(eachCharacter->Character.toLowerCase(eachCharacter))
                                                 .collect(Collectors.groupingBy(eachCharacter->eachCharacter, Collectors.counting()));
        
        System.out.println(frequency);
        
        
    }
    
}
