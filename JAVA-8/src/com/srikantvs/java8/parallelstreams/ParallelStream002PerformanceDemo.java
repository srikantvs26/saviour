package com.srikantvs.java8.parallelstreams;

import java.util.stream.IntStream;

public class ParallelStream002PerformanceDemo {

    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();
        int sumSequential = IntStream.rangeClosed(1, 99999)
                                     .sum();
        long endTime = System.currentTimeMillis();
        System.out.println("sumSequential :" + sumSequential + " Time Taken :"
                + (endTime - startTime) + " milliseconds");

        // ------------------------------------------------

        long startTimep = System.currentTimeMillis();
        int sumInParallel = IntStream.rangeClosed(1, 99999)
                                     .parallel()
                                     .sum();
        long endTimep = System.currentTimeMillis();
        System.out.println("sumInParallel : " + sumInParallel + " Time Taken :"
                + (endTimep - startTimep) + " milliseconds");

        // output:
        // sumSequential :704982704 Time Taken :105 milliseconds
        // sumInParallel : 704982704 Time Taken :7 milliseconds

        // We can see how fast parallel stream really is.

    }

}
