package com.srikantvs.java8.this_keyword;

// invoking overloaded constructors through this()
// Advantages:
// using this for constructor overloading can prevent unnecesssary duplication of code.

// Restrictions:
// this or super must be first line in constructor.
// We cannot use super and this in the same constructor.
// We cannot use instance variables in a this() call. (ThisDemo6)
class Box5 {

    double length;
    double breadth;
    double height;

    Box5(double length, double breadth) {
        this(1); // we are not using instance variable in a this call.
        this.length = length;
        this.breadth = breadth;
    }

    Box5(double height) {
        this.height = height;
    }

    Box5() {

    }

    void volume() {
        System.out.println("Volume :: " + length * breadth * height);
    }

}

public class ThisDemo4 {

    public static void main(String[] args) {
        Box5 box = new Box5(15555, 1555);
        box.volume();
    }

}
