package com.srikantvs.java8.collections;

import java.util.TreeSet;

class Dog implements Comparable<Dog>{

    @Override
    public int compareTo(Dog o) {
        return 0;
    }

   

}

public class TreeSetDemo {
    public static void main(String[] args) {
        
        TreeSet<Dog> pp = new TreeSet<>();
        pp.add(new Dog());
        pp.add(new Dog());
        pp.add(new Dog());

        System.out.println(pp.size());
        

        TreeSet<Integer> tt = new TreeSet<>();
        tt.add(1);
        tt.add(1);

        tt.add(1);
        tt.add(new Integer(1));
        System.out.println(tt.size());

    }
}
