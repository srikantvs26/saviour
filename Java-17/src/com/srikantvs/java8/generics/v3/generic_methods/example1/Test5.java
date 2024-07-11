package com.srikantvs.java8.generics.v3.generic_methods.example1;

import java.util.ArrayList;
import java.util.List;

public class Test5 {

	public static void main(String[] args) {
		m1(new ArrayList<>(List.of(1, 2, 3))); // T is Integer
		m1(new ArrayList<>(List.of(1.1, 2.1, 3.1))); // T is Double

		m1(new ArrayList<>(List.of(new Object(), new Object(), new Object()))); // ERROR
		m1(new ArrayList<>(List.of("world", "wrestling", "entertainment"))); // ERROR
	}

	/**
	 * T is Integer m1 can be called ay any List of any type but it should be of
	 * Type Number or its super class like Object Integer Okay, Double Okay We
	 * cannot add anything because we don't know what List l will be? Integer,
	 * Double
	 * 
	 * Good for reading values
	 */

	// Not applicable, super is not applicable for Type parameter T.
	public static <T super Number> void m1(List<? super T> l) {
        l.add(null);
        l.add(3.3); //ERROR
        System.out.println(l);

    }

	public static <T super Number> void m2(List<? extends T> l) {
        l.add(null);
        l.add(3.3); //ERROR
        System.out.println(l);

    }
}
