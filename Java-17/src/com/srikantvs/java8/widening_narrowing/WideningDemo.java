package com.srikantvs.java8.widening_narrowing;

public class WideningDemo {

    public static void main(String[] args) {
        
        int i = 1;

        // widening
        long l = i;
        double d = i;



        // narrowing (should be done explicitly)
        char c = (char)i;

        // byte p =3;
        // byte q = 4;

        // byte r = (byte)(p+q);
        // int m = (byte) (p+q);


    }

}
