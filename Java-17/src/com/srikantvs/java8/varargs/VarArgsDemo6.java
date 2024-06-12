package com.srikantvs.java8.varargs;

public class VarArgsDemo6 {

    static void testMe(int... x) {
        for (int p : x) {
            System.out.println(p);
        }
    }


    static void testMe(int n,int... x) {
        for (int p : x) {
            System.out.println(p);
        }
    }
   

    public static void main(String[] args) {
        testMe(1,3);
        testMe(45,55);
    }
}
