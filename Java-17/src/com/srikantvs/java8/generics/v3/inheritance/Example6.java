package com.srikantvs.java8.generics.v3.inheritance;

/**
 * Changing order of Types. Order in which Generics are sent to parent class
 * type matters.
 */
class L<T, G> {
	T a;
	G b;
}

// N<Double, String> will go as L<String, Double>
class N<Q, Z> extends L<Z, Q> {

}

public class Example6 {
	public static void main(String[] args) {

		N<Double, String> b = new N<>();
		// a is String, and b is Double
		b.a = "Hi";
		b.b = 1.1;

		// Ordering matters
		L<Integer, String> a1 = new N<>();
		L<Integer, String> a2 = new N<Integer, String>();// ERROR

		L<Integer, String> a3 = new N<String, Integer>();

		// bhai pehla hi dusra hai, dusra hi pehla hai.
		L<? extends Number, ?> a4 = new N<String, Integer>();
		L<? extends Number, ?> a5 = new N<String, Double>();

	}

}
