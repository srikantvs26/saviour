package com.srikantvs.java8.generics.v3;
/**
 * Inheritance with Generics, without specifying the type to superclass 
 */
class A<T> {
    T a;
}
/**
 * I don't specify any Generic Type on A, What does that mean?
 */
class B<G> extends A{ // Not recommended, always give type when using Generics.


}

public class Example1 {
    public static void main(String[] args) {

        // Now if I create a instance of B with Integer what will be type of A? 
        // As we have not specified the type of A, it will become automatically Object, because of backward compatibility.
        // So we can give any kind of value to a.
        B<Integer> b1 = new B<>();
        b1.a=10;
        b1.a="Hi";

        System.out.println(b1.a.getClass());
        
    }
}
