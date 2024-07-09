package com.srikantvs.java8.generics.v1;
/**
 * difference b/w Foo<Object> vs Foo<?>
 */
class Foo<T> {

}

public class Example6 {
    public static void main(String[] args) {
        Foo<Object> f1 = new Foo<Object>();
        Foo<Object> f2 = new Foo<Number>();// ERROR, because we have specified precise type.
        Foo<Object> f3 = new Foo<String>();// ERROR

        Foo<?> f4 = new Foo<Object>();
        Foo<?> f5 = new Foo<Number>();// ERROR
        Foo<?> f6 = new Foo<String>();// ERROR

    }
}
