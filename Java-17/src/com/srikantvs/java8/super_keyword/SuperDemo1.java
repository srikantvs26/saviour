package com.srikantvs.java8.super_keyword;

// Problem if we don't use super keyword.

class Box {
    double length;
    double breadth;
    double height;

    Box(double l, double b, double h) {
        length = l;
        breadth = b;
        height = h;
    }

    double volume() {
        return length * breadth * height;
    }

    Box() {

    }
}

class BoxWeight extends Box {
    // BoxWeight has access to length breadth and height? How do we initalize those in
    // constructor?
    double weight;

    BoxWeight(double l, double b, double h, double w) {
        // as we have access to length breadth and height we will assign them again in subclass this is not implemented efficiently or
        // robustly. the constructor in BoxWeight explictly initalizes length, breadth and height fields of Box. It duplicates the code
        // found in superclass, which is inefficient, but it also implies that subclass must be granted access to these members. However
        // there will be times when you want to create a superclass that keeps the details of its implementation to itself(keep its data
        // members private). In this case there would be no way for a subclass to directly access orinitalize these variables on its own.
        // Whenever a subclass needs to refer to its IMMEDIATE superclass it can do so by using super keyword.

        length = l;
        breadth = b;
        height = h;
        weight = w;
    }
}

public class SuperDemo1 {

}
