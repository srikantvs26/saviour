package com.srikantvs.java8.generics.v1;

import java.io.Serializable;
import java.security.Principal;

/**
 * 4 Type constraints
 */
class Foo<T> {

}

public class Example5 {

    // instance variable
    Foo<Integer> p;

    // static variable
    static Foo<Integer> x;

    /**
     * return type of method
     * parameter of method
     * local variable
     * 
     * @param x
     * @return
     */
    static Foo<Integer> m1(Foo<Integer> x) {
        Foo<Integer> f1 = new Foo<Integer>();
        return f1;
    }

    public static void main(String[] args) {

        /**
         * This is what we can declare on the left side, i.e declaration of variable of type having Generics.
         * We can use the type Foo<Integer> declaration to declare a local variable, instance variable,static variable, return type of
         * method, parameter of method.
         * 
         * You should know that they are the constraints.
         */
        Foo<Integer> f1;
        Foo<?> f2; // any object wildcard
        Foo<? extends Number> f3;
        Foo<? super Number> f4;

        /**
         * What constraints does?
         *
         * A constraint forces you/tells you, what you are allowed to have as the generic type of the instance you provide on RHS.
         * constraint on f1 only allows for precise type, i.e Integer only.
         */
        f1 = new Foo<Integer>();
        f1 = new Foo<Double>();// ERROR
        Foo<Number> f6;
        f6 = new Foo<Number>();
        f6 = new Foo<Integer>(); // ERROR, it has to be precise even though Integer extends Number, Inheritance won't work here, neither
                                 // super class nor subclass.

        // f3 can have Number or its child class as Type T
        f3 = new Foo<Number>();
        f3 = new Foo<Integer>();
        f3 = new Foo<Double>();
        f3 = new Foo<String>(); // String don't extend Number
        f3 = new Foo<Object>();

        // f4 can have Number or its parent classes as Type T
        f4 = new Foo<Number>();
        f4 = new Foo<Object>();
        f4 = new Foo<Serializable>();
        f4 = new Foo<Integer>();

        // ? any possible type
        f2 = new Foo<Principal>();
        f2 = new Foo<Object>();
    }

}
