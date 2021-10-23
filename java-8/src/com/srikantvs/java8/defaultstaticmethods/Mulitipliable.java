package com.srikantvs.java8.defaultstaticmethods;

import java.util.List;
import java.util.Objects;

public interface Mulitipliable {

    int muliply(List<Integer> integerList);
    
    default int size(List<Integer> integerList) {
        return integerList.size();
    }
    
    static boolean isEmpty(List<Integer> integerList) {
        return integerList != null && integerList.size() == 0;
    }
}
