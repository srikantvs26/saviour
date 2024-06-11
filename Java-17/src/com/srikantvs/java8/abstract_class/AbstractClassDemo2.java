package com.srikantvs.java8.abstract_class;

abstract class Figure {
    double dim1;
    double dim2;

    Figure(double a, double b) {
        this.dim1 = a;
        this.dim2 = b;
    }

    abstract double area();
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

public class AbstractClassDemo2 {
    public static void main(String[] args) {
        
        Figure f = new Rectangle(10, 20);
        System.out.println("Area :: "+f.area());

    }
}
