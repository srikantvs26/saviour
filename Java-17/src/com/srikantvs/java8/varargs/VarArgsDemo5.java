package com.srikantvs.java8.varargs;

public class VarArgsDemo5 {

    static void testMe(int... x) {
        for (int p : x) {
            System.out.println(p);
        }
    }

    static void testMe(boolean... b){
        for (boolean c : b) {
            System.out.println(c);
        }
    }

    public static void main(String[] args) {
        testMe(123, 34, 55, 666);
        testMe(4);
        testMe(true, false, true);

        testme();//error
    }

}
