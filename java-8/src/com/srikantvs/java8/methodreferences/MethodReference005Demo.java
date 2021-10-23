package com.srikantvs.java8.methodreferences;

import java.security.SecureRandom;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Supplier;

import com.srikantvs.java8.data.Student;
import com.srikantvs.java8.data.StudentDataBase;

public class MethodReference005Demo {
    
    public static void main(String[] args) {
        
        
        int[] array = new int[10];
        // s->new int[10];//take size and return new array.
        
        Function<Integer, int[]> test = x->new int[x];
        Function<Integer, int[]> testMR = int[]::new;
        
        
        
        IntFunction<int[]> test1 = x->new int[x];
        IntFunction<int[]> test1MR = int[]::new;
        
        
        
    }
}
