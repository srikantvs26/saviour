package com.srikantvs.java8.generics.v3.inheritance;

class V<T,G>{
    T a;
    G b;
}

class S<Q> extends V<Q, Integer>{

}


public class Example5 {
    public static void main(String[] args) {
        
        S<Double> b1 = new S<>();
        b1.a = 12.2;// Double
        b1.a = "Hello";// error

        b1.b = 10; // only Integer
        b1.b = 10.1;// error
    }

}
