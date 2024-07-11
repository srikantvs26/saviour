package com.srikantvs.java8.generics.generic_methods_without_type_parameter;

import java.util.ArrayList;
import java.util.List;

public class Test4 {

	public static void main(String[] args) {
		m1(new ArrayList<>(List.of(1, 2, 3)));
		m1(new ArrayList<>(List.of(1.1, 2.1, 3.1)));
		m1(new ArrayList<>(List.of(new Object(), new Object(), new Object()))); // OK

		m1(new ArrayList<>(List.of("world", "wrestling", "entertainment"))); // ERROR
	}

	/**
	 * We can see that, m1 method can be called by ONLY object type, List of
	 * Integer, List of String We can add null to the list l We can add values to
	 * List l of only l type.
	 */
	public static void m1(List<Object> l) {
		l.add(null);
		l.add(new Object());
		l.add(20.6);
		l.add(10);
		l.add("Hi");
		System.out.println(l);

	}

	/**
	 * Can only be called by List of String type and we can only add Strings to l.
	 */
	public static void m2(List<String> l) {
		l.add(null);
		l.add("Hi");
		l.add("Hello");
		System.out.println(l);

	}

}
