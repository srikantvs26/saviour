package com.srikantvs.java8.local_variable_type_inference;

public class TypeReference_Caveats {
    public static void main(String[] args) {

        int[] x1 = { 1, 2, 4 };
        var[] x2 = { 1, 2, 4 }; // incorrect

        var p1 = { 1, 2, 4 }; // incorrect
        var p2 = new int[] { 1, 3, 5 };

    }
}
