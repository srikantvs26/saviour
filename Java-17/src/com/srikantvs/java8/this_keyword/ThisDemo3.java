package com.srikantvs.java8.this_keyword;

class Box4 {
    double length;
    double breadth;

    Box4(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    Box4() {

    }

    void area() {
        System.out.println(length * breadth);
    }
}

class BoxWeight4 extends Box4 {
    boolean length; // this will hide the superclass's length
    double breadth;

    void show() {
        System.out.println(this.length);
        System.out.println(this.breadth);
    }
}

public class ThisDemo3 {
    public static void main(String[] args) {
        BoxWeight4 boxWeight4 = new BoxWeight4();
        boxWeight4.show();
    }
}
