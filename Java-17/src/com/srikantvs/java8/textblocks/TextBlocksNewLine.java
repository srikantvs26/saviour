package com.srikantvs.java8.textblocks;

public class TextBlocksNewLine {
    public static void main(String[] args) {
        
        String socialMedia = """
                twitter
                facebook
                instagram
                """;

        System.out.println(socialMedia);// see the output you will see one new line after instagram

        String colors = """
                red
                blue
                green""";

        System.out.println(colors);// no new line after green

    }
}
