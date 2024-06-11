package com.srikantvs.java8.constructors_and_super_keyword;

class Box {
    double length;
    double breadth;

    // No default constructor, so we have to call super() with arguments compulsarily.
    Box(double l, double b) {
        length = l;
        breadth = b;
    }

    // When we have a parametrized constructor the compiler will not gives us default constructor.
    Box(){
        length = -1;
        breadth = -1;
    }
}

class BoxWeight extends Box {
    double weight;

    BoxWeight(double l, double b, double h, double w) {
        // compiler automatically inserts super() here.
        weight = w;
    }

    double area() {
        return length * breadth;
    }
}

public class ConstructorSuperDemo2 {

    public static void main(String[] args) {

    }

}
