package com.srikantvs.java8.this_keyword;

// invoking overloaded constructors through this()

class Box5 {

    double length;
    double breadth;
    double height;

    Box5(double length, double breadth) {
        this(1);
        this.length = length;
        this.breadth = breadth;
    }

    Box5(double height) {
        this.height = height;
    }

    void volume() {
        System.out.println("Volume :: " + length * breadth * height);
    }

}

public class ThisDemo5 {

    public static void main(String[] args) {
        Box5 box = new Box5(15555, 1555);
        box.volume();
    }

}
