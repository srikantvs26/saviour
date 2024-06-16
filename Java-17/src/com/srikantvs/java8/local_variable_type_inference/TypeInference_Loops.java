package com.srikantvs.java8.local_variable_type_inference;

import java.util.Arrays;

public class TypeInference_Loops {

    public static void main(String[] args) {

        var numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        for (var i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        //========================================================

        for(var num:numbers){
            System.out.println(num);
        }

    }

}
