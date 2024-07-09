package com.srikantvs.java8.generics.v1;

class Foo {
    Object x;
}

public class Example1 {
    public static void main(String[] args) {
        Foo foo = new Foo();
        foo.x = 34; // Integer

        // ---

        int res = (int) foo.x;
        System.out.println(res);

        // ---

        Foo foo2 = new Foo();
        foo2.x = "Hi"; // String
        int res2 = (int) foo2.x; // ClassCastException, but compiles fine, Object is getting casted to Integer, More general type to
                                 // specific type so its possible,
                                 // Here the compiler don't yet know the runtime type of foo2.x at compile time its an Object.
        System.out.println(res2);
    }
}
