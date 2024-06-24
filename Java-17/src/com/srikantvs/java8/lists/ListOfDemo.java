package com.srikantvs.java8.lists;

import java.util.List;

public class ListOfDemo {

    public static void main(String[] args) {
        var someNumbers = List.of(1,2,3);
        System.out.println("someNumbers :: "+someNumbers);
        someNumbers.add(4); // as someNumbers is unmodifiable list it will lead to UnSupportedOperationException
        System.out.println(someNumbers);

    }

}
