package com.srikantvs.java8.streams;

public class Streams12ShortCircuitingDemo {

    public static void main(String[] args) {

        /*
         * Streams api short circuiting methods.
         * 
         * limit findFirst findAny
         * 
         * below 3 take predicate as input.
         * 
         * anyMatch allMatch noneMatch
         * 
         * 
         * An intermediate operation is short-circuiting if, when presented with
         * infinite input, it may produce a finite stream as a result. A
         * terminal operation is short-circuiting if, when presented with
         * infinite input, it may terminate in finite time.
         * 
         * Having a short-circuiting operation in the pipeline is a necessary,
         * but not sufficient, condition for the processing of an infinite
         * stream to terminate normally in finite time.
         *
         */

    }

}
