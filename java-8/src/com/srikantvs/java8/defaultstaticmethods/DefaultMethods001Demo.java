package com.srikantvs.java8.defaultstaticmethods;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DefaultMethods001Demo {

    public static void main(String[] args) {

        /**
         * sort the list of names in alphabetic order.
         */

        List<String> names = Arrays.asList("one", "two", "three", "four");
        System.out.println("unsorted names : " + names);

        // before java 8
        Collections.sort(names);
        System.out.println("sorted names :" + names);

        // after java java 8.
        names.sort(Comparator.comparing(name -> name));// sort is default method
        System.out.println("sorted names :" + names);

        names.sort(Comparator.reverseOrder());
        System.out.println("sorted names reversed : " + names);

        names.sort(Comparator.naturalOrder());
        System.out.println("sorted names : " + names);

        // 2 args comparing.
        List<String> wweSuperStars = Arrays.asList("johncena", "undertaker",
                "carlito");
        System.out.println("wweSuperStars unsorted : " + wweSuperStars);
        Comparator<String> keyComparator = (s1, s2) -> s2.compareTo(s1);
        wweSuperStars.sort(Comparator.comparing(name -> name, keyComparator));
        System.out.println("wweSuperStars sorted : " + wweSuperStars);

    }

}
