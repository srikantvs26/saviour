package com.srikantvs.java8.generics.v2;

/**
 * Applying constraints from class itself.
 * 
 */

class C<N> {
    public void m1(N n) {
        // I want N to be number, can I get number methods here with n?
        n.floatValue();// ERROR
    }
}

class P<N extends Number> {// We have specified boundary here that N will always be a Number
    public void m1(N n) {
        // Now We have all Number class methods.
        System.out.println(n.doubleValue());
        System.out.println(n.floatValue());
        System.out.println(n.intValue());
    }
}

// Super not applicable.
class Q<N super Number>{

}

public class Example5 {

}
