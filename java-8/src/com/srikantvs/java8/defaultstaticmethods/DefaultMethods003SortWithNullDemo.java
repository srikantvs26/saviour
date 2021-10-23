package com.srikantvs.java8.defaultstaticmethods;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.srikantvs.java8.data.Student;
import com.srikantvs.java8.data.StudentDataBase;

public class DefaultMethods003SortWithNullDemo {

    public static void main(String[] args) {
        
        
        
        List<String> wweNames = Arrays.asList("undertaker","johncena",null,"randyorton","miz");
        
        //  wweNames.sort(Comparator.comparing(name->name));// NPE
        
        // so how to sort when nulls are there.
        
        wweNames.sort(Comparator.nullsFirst(Comparator.comparing(Function.identity())));// null will come in first
        System.out.println(wweNames);
        Comparator<String> nullsLastComparator = Comparator.nullsLast(Comparator.comparing(name->name)); // null will come in end
        wweNames.sort(nullsLastComparator.reversed());
        
        System.out.println(wweNames);
    }

}
