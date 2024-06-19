package com.srikantvs.java8.super_keyword;

// 1. Using super to call superclass constructors

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
}

class BoxWeight extends Box {
    // BoxWeight has access to length breadth and height? How do we initalize those in
    // constructor? use super keyword
    double weight;

    BoxWeight(double l, double b, double h, double w) {
        super(l, b, h);
        weight = w;
    }
}

public class SuperDemo2 {

}
