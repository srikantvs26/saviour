package com.srikantvs.java8.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericMethodsDemo {

    public static void main(String[] args) {
        test("Hello");
        test(123);
        // =======================================================================
        test2(new Integer[] { 1, 2, 3 });
        // =======================================================================
        test3(List.of(1.3, 2.6, 3.8));
        // =======================================================================
        test4(List.of(4.5, 6.9, 8.88));
        //========================================================================
        test5(List.of(4.5, 6.9, 8.88));

        getMax(List.of(4.5, 6.9, 8.88));
        getMax(List.of(888, 88, 8));
        getMin(List.of(1888, 288, 38));
        getMin(List.of(8.88, 8.0008, 8.0));

        List<Double> dx = new ArrayList<>();
        dx.add(34.5);
        dx.add(344.55);
        getMin(dx);

        // =======================================================================

        // List<Number> d = new ArrayList<>();
        // d.add(34.5);
        // d.add(344.55);
        // getMin(d);// Number doesn't implement comparable so it gives error, previous  example don't give error because Double does implement Comparable interface.
        
        // =======================================================================
        printMe(List.of(3,1,3));
        List<Number> nums = new ArrayList<>();
        nums.add(3);
        nums.add(4.4);
        nums.add(4.4f);
        printMe(nums);
    }

    public static <T> void test(T a) {
        System.out.println(a);
    }

    public static <T> void test2(T[] a) {
        System.out.println(Arrays.toString(a));
    }

    public static <T> void test3(List<? extends Number> a) {
        System.out.println("test3 :: " + a);
    }

    public static void test4(List<? extends Number> a) {
        System.out.println("test4 :: " + a);
    }

    public static <T> void test5(List<? extends T> a) {
        System.out.println("test5 :: " + a);
    }

    public static <T extends Comparable<T>> void getMin(List<? extends T> a) {

        T max = a.get(0);
        for (T t : a) {
            if (t.compareTo(max) < 0) {
                max = t;
            }
        }

        System.out.println("Minimum is :: " + max);
    }

    public static <T extends Comparable<T>> void getMax(List<T> a) {
        T max = a.get(0);
        for (T t : a) {
            if (t.compareTo(max) > 0) {
                max = t;
            }
        }

        System.out.println("Maximum is :: " + max);
    }

    public static <T> void printMe(List<? extends T> a){
        System.out.println("printMe :: "+a);
    }

}
