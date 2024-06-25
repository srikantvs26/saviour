package com.srikantvs.java8.lists.java10collectionapienhancements;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CopyOfDemo {

    public static void main(String[] args) {

        // points to keep in mind:
        // 1. Collection should not be null or contain null values o/w we will get NPE
        // 2. If Original collection is modified after calling copyOf method then newly created list is not updated.
        // 3. If the Original collection itself is unmodifiable by var x = List.of(1,2,3), invoking copyOf doesn't create a copy.

        ArrayList<Integer> modifiableList = new ArrayList<>(List.of(1, 2, 3)); // List.of shouldn't contain null elements
        var unmodifiableList = List.copyOf(modifiableList);
        System.out.println("unmodifiableList" + unmodifiableList);

        Set<Integer> unmodifiableSet = Set.copyOf(modifiableList);
        System.out.println("unmodifiableSet :: "+ unmodifiableSet);

        HashMap<String,Integer> phoneNumbersMap = new HashMap<>(Map.of("one",123456789, "two", 987654321));
        var phoneNumbers = Map.copyOf(phoneNumbersMap);
        System.out.println("unmodifiableMap :: "+phoneNumbers);
    }

}
