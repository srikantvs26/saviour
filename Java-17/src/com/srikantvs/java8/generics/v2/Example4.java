package com.srikantvs.java8.generics.v2;

class Z<T> {
    T a;

    public Z(T a) {
        this.a = a;
    }

}

public class Example4 {
    public static void main(String[] args) {
        Z<?> z = new Z<>(10);
        System.out.println(z.a.getClass()); // java.lang.Integer

        // is same as
        // We have not specified the type so Diamond operator automatically refer the type to the most general object, that is Object class
        Z<?> z1 = new Z<Object>(10);

        Z<? extends Number> z2 = new Z<Object>(10); // Error because Object type don't respect the constraint. <? extends Number>




        
        Z<? super Number> z3 = new Z<>(23); // Okay, In diamond Operator automatically assumes the type to most general Object as shown
                                            // below.
        // is same as
        Z<? super Number> z4 = new Z<Object>(23); // Object respect the <? super Number> constraint,
    }
}
