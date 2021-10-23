package com.srikantvs.java8.parallelstreams;

import java.util.stream.IntStream;

public class ParallelStream003NumberOfProcessorsDemo {

    public static void main(String[] args) {
        
        // As Number of threads created == number of processors available in the machine.
        // Number of processors available.
        
        System.out.println(Runtime.getRuntime().availableProcessors());
        
    }

}
