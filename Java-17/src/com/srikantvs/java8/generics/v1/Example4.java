package com.srikantvs.java8.generics.v1;
/**
 * Diamond Operator
 */

class Foo<T>{
    T x;
    public T getX() {
        return x;
    }

    public void setX(T x) {
        this.x = x;
    }

    public Foo(T x) {
        this.x = x;
    }    
}
public class Example4 {

    public static void main(String[] args) {
        // using Diamond Operator
        Foo<String> foo = new Foo<>("Hi");
        System.out.println(foo.x);


    }

}
