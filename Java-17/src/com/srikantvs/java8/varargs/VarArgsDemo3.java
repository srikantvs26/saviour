package com.srikantvs.java8.varargs;

import java.util.Arrays;

public class VarArgsDemo3 {


    static void testMe(boolean... b){
        for(boolean x : b){
            System.out.println(x);
        }
    }
    static void testMe(String username, String password, int... x) {
        System.out.println("length of arguments :: " + x.length);
        int sum = Arrays.stream(x).sum();
        System.out.println("sum is :: " + sum);
        System.out.println("username :: "+username);
        System.out.println("password :: "+password);
    }

    

    static void testMe(int... x){
        for(int p:x){
            System.out.println(p);
        }
    }

    public static void main(String[] args) {
        testMe("admin","admin@123",1, 2, 3);
        testMe(false, false, true);
        testMe(123,34,55,666);
    }

}
