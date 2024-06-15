package com.srikantvs.java8.usecases;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class LetterFrequencyCountDemo {

    public static void main(String[] args) {

        String message = "A unique blend of the woodly notes of mahogany and vetiver "
                + "give you the freshness of a forst. Wile Stone... get noticed";
        
        
        System.out.println(message);
        
        //count the frequency of each letter
        
        Map<Character, Long> letterFrequency = message.chars()
                .mapToObj(chr->(char)chr)
                .collect(Collectors.groupingBy(letter->letter,Collectors.counting()));
        
        System.out.println(letterFrequency);
        // {A=1, S=1, W=1,  =21, a=4, b=1, c=1, d=4, e=14, f=5, g=3, h=4, i=5, l=3, m=1, .=4, n=8, o=11, q=1, r=3, s=5, t=8, u=3, v=3, w=1, y=3}
        
        System.out.println("============================================================================================");
        
        String[] messageTemp = message.split(" ");
        // now count here.
        Map<String, Long> letterFrequency2 = Arrays.stream(messageTemp)
                .collect(Collectors.groupingBy(letter->letter,Collectors.counting()));
        
        System.out.println(letterFrequency2);// see the output this is not what we want, it has become word count
        // {a=1, give=1, mahogany=1, A=1, Wile=1, notes=1, forst.=1, blend=1, noticed=1, freshness=1, the=2, Stone...=1, vetiver=1, and=1, get=1, of=3, unique=1, woodly=1, you=1}
        
        System.out.println("============================================================================================");
        
         Map<Character, Long> letterFreq = Arrays.stream(messageTemp)
                 .flatMapToInt(takeEachWord->takeEachWord.chars())
                 .mapToObj(eachInt->(char)eachInt)
                 .collect(Collectors.groupingBy(letter->letter,Collectors.counting()));
         
         System.out.println(letterFreq);// see our approach here.
         // {A=1, S=1, W=1, a=4, b=1, c=1, d=4, e=14, f=5, g=3, h=4, i=5, l=3, m=1, .=4, n=8, o=11, q=1, r=3, s=5, t=8, u=3, v=3, w=1, y=3}    
    }

}
