package com.srikantvs.java8.abstract_class;

class Figure{
    double dim1;
    double dim2;

    Figure(double a, double b){
        this.dim1 = a;
        this.dim2 = b;
    }

    double area(){
        // Warning message, better if we make this abstract we will force the subclass to override.
        // Currently sub class may or may not override area method.
        System.out.println("Area for figure is undefined.");
        return 0;
    }
}

class Rectangle extends Figure{

    Rectangle(double a, double b){
        super(a, b);
    }

    @Override
    double area(){
        return dim1 * dim2;
    }
}

public class FindArea {

}
