package com.srikantvs.java8.generics.v3;

class A<T,G>{
    T a;
    G b;
}

class B<Q> extends A<Q, Integer>{

}


public class Example5 {
    public static void main(String[] args) {
        

        B<Double> b1 = new B<>();
        b1.a = 12.2;// Double
        b1.a = "Hello";// error

        b1.b = 10; // only Integer
        b1.b = 10.1;// 
    }

}
