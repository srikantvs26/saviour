package com.srikantvs.java8.parallelstreams;

import java.util.stream.IntStream;

public class ParallelStream001Demo {

    public static void main(String[] args) {
        
        int sumSequential = IntStream.rangeClosed(1, 100)
                                     .sum();
        System.out.println("sumSequential :"+sumSequential);
        
        //------------------------------------------------
        
        int sumInParallel = IntStream.rangeClosed(1, 100)
                                     .parallel()
                                     .sum();
        
        System.out.println("sumInParallel : "+sumInParallel);
        
        
        
    }
    
}
