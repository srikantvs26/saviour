package com.srikantvs.java8.generics.generic_class;

class Z1<T> {

}

class Z2<?>{

}

class Z3<T extends Number>{

}

// super is not applicable for type parameter T, but we can use super with wildcard "?"
class Z4<T super Number>{

}

public class Test1 {

    public static void main(String[] args) {
        
    }

}
