package com.srikantvs.java8.this_keyword;
// Sometimes a method will need to refer to the object that invoked it. To allow this, Java has this keyword.
// this can be used inside any method to refer to the current object.
// this always refers to the object on which method was invoked.


// A redundant use of this.
// Box(double w, double h, double d) {
//     this.width = w;
//     this.height = h;
//     this.depth = d;
// }


class Box{
    double width;
    double height;
    double depth;

    // Redundant, as the constructor parameter and instance variable names are not same so its redundant.
    Box(double w, double h, double d){
        this.depth = d;
        this.height = h;
        this.width = w;
    }

}

public class ThisDemo1 {

    public static void main(String[] args) {
    }

}
