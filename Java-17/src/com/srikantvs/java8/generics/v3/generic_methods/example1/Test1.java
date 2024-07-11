package com.srikantvs.java8.generics.v3.generic_methods.example1;

import java.util.ArrayList;
import java.util.List;

public class Test1 {

	public static void main(String[] args) {
		m1(new ArrayList<>(List.of(1, 2, 3))); // T is Integer
		m1(new ArrayList<>(List.of(1.1, 2.1, 3.1))); // T is Double
		m1(new ArrayList<>(List.of(new Object(), new Object(), new Object()))); // T is Object
		m1(new ArrayList<>(List.of("world", "wrestling", "entertainment"))); // T is String
	}

	/**
	 * This method can be called by any Type List of Integer, List of Double etc.
	 * 
	 * We cannot add anything to l because we don't know the type of l we will be
	 * getting, List<Integer>, List<Double> etc. 1st example T is Integer Good for
	 * reading the values
	 */
	public static <T> void m1(List<? extends T> l) {
		l.add(null);
		System.out.println(l);

	}
}
