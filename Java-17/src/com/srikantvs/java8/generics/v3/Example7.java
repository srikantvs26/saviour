package com.srikantvs.java8.generics.v3;

/*
 * Using interfaces with Generics
 */
interface I<T> {
    T m1();

    void play(T t);
}

class R<T> implements I<T> {

    @Override
    public T m1() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void play(T t) {
        System.out.println(t);

    }

}

public class Example7 {

    public static void main(String[] args) {

        I<String> i1 = new I<>() {
            @Override
            public void play(String s) {
                System.out.println(s);
            }

            @Override
            public String m1() {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'm1'");
            }
        };

        i1.play("Java Programming");

        R<Double> c1 = new R<>();
        c1.play(8.8);

        I<String> i2 = new R<String>();// remember constraints, new R<String> is what gets passed to R.
        i2.play("Hi");

        I<? extends Number> i4 = new R<Integer>();
        i4.play(44);// Does not work because, the compiler is not sure of Type, It can an Integer, Double, Long etc.

        I<? super Number> i5 = new R<Object>();
        i5.play(33.3);
        i5.play(10);

    }

}
