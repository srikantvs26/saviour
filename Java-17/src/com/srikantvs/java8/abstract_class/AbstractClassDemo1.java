package com.srikantvs.java8.abstract_class;

// There are situations where we want to define a superclass that declare the structure of a given abstraction(Animal) without providing the complete implementation of every method. We want the superclass to only define the generalized form which will be shared by all of its subclasses, We want the subclasses to complete implementation of those methods.

// It is very common for a method to have no meaningful definition in the context of its superclass, one way is to simply have it report a warning message(FindArea example). Its useful in some situations like debugging, but its not appropriate. We want some methods to be overridden compulsarily by the subclasses so that the class can have some meaning. If we want to ensure that a subclass indeed override all necessary methods. We have to use abstract methods.

// Any class that have abstract methods must be abstract.

// There can be no objects of abstract class, We can't insantiate it with new operator.

// There are no abstract constructors or abstract static methods.

abstract class A {
    abstract void callMe();

    void callMeToo() {
        System.out.println("This is a concrete method.");
    }
}

class B extends A {

    @Override
    void callMe() {
        System.out.println("B's implementation of callMe() ");
    }
}

public class AbstractClassDemo1 {
    public static void main(String[] args) {
        B b = new B();
        b.callMe();
        b.callMeToo();

        // A a = new A();// illegal now not allowed

        A a1 = new B(); // allowed
        a1.callMe(); // overridden method will be called.
    }
}
