package com.srikantvs.java8.this_keyword;

// this can be used to resolve the instance variable hiding problem.
// When a local variable has the same name as an instance variable, the local variable hides the
// instance variable.

// this lets you refer directly to the object, you can use it to resolve any namespace
// collisions that might occur between instance variables and local variables. For example, here is
// another version of Box( ), which uses width, height, and depth for parameter names and then
// uses this to access the instance variables by the same name:

class Box2 {
    double width;
    double height;
    double depth;

    // using this to resolve namespace collisions
    Box2(double width, double height, double depth) {
        this.depth = depth;
        this.height = height;
        this.width = width;
    }

    void volume(){
        System.out.println(width * height * depth);
    }
}

public class ThisDemo2 {

    public static void main(String[] args) {
        Box2 box = new Box2(0, 0, 0);
        box.volume();
        System.out.println(box);
    }

}
