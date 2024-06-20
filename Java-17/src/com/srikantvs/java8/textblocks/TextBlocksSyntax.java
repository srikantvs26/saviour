package com.srikantvs.java8.textblocks;

public class TextBlocksSyntax {

    public static void main(String[] args) {
        // OK
        String colors = """
            red
            blue
            green
        """;
        // ERROR
        String colors2 = """ red
                blue
                green
                """;

        // ERROR, comment the previous error and see
        String fullName = """Pat Q. Smith""";

        System.out.println(fullName);
    }
}
