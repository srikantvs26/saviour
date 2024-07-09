package com.srikantvs.java8.generics.v1;

/**
 * We will provide value of T when we are creating the instance of Foo
 */
class Foo<T> {
    T x;

    public Foo() {

    }

    public Foo(T x) {
        this.x = x;
    }

    public T getX() {
        return x;
    }

    public void setX(T x) {
        this.x = x;
    }

    public void printX() {
        System.out.println("x is : " + this.x);
    }

}

public class Example2 {
    public static void main(String[] args) {
        Foo<Integer> foo = new Foo<Integer>();

        foo.x = 10;

        int res = foo.x;// no casting required.

        foo.x = "Hi";// Compile time error. Type mismatch: cannot convert from String to Integer



        Foo<String> foo2 = new Foo<String>();
        foo2.x="Hi";

        int p = (int)foo2.x;// Compile time error. Cannot cast from String to int



    }
}
