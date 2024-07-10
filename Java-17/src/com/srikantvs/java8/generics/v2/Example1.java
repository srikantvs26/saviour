package com.srikantvs.java8.generics.v2;

/**
 * Diamond Operator
 */

class Moo<T> {
    T x;

    public T getX() {
        return x;
    }

    public void setX(T x) {
        this.x = x;
    }

    public Moo(T x) {
        this.x = x;
    }
}

public class Example1 {

    public static void main(String[] args) {
        // using Diamond Operator
        // The compiler can infer the Type on RHS automatically form Java 7 onwards, Its not needed because it boiler plate code. Java can
        // understand that you would have anyway written String on RHS side.
        Moo<String> foo = new Moo<>("Hi"); // Java 7
        System.out.println(foo.x);

        Moo<Number> foo2 = new Moo<Number>(14);
        // same as
        Moo<Number> foo3 = new Moo<>(14); // Here on RHS type you can only write Number here, Integer will give error on RHS.

        // See.
        Moo<Number> foo4 = new Moo<Integer>(14); // ERROR

    }

}
