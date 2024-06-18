package com.srikantvs.java8.local_variable_type_inference;

@FunctionalInterface
interface Calculation2 {
    public abstract String concatMe(String a, String b);
}

public class TypeReferenceLambdaExFormalParameterDemo {

    public static void main(String[] args) {

        Calculation2 summer = (var a, var b) -> a.concat(b);
        System.out.println(summer.concatMe(null, null));

    }

}
