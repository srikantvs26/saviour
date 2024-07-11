package com.srikantvs.java8.generics.v3;
/**
 * Inheritance with Generics with superclass type as String type.
 */
class A<T> {
    T a;
}
/**
 * A's type is always String, Whatever may be type of instance of B, B<Integer> or B<Double>. A's type always String
 */
class B<G> extends A<String>{ 


}

public class Example2 {
    public static void main(String[] args) {

        // Now if I create a instance of B with Integer what will be type of A? 
        // As we have specified the type of A, it is Integer
        // So we can give any kind of value to a.
        B<Integer> b1 = new B<>();
        b1.a="Hi"; // A class a attribute will always take String for any instance of B, here its Integer
        b1.a=10; // ERROR

        System.out.println(b1.a.getClass());
        
    }
}
