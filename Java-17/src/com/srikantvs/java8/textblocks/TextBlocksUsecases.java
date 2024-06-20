package com.srikantvs.java8.textblocks;

public class TextBlocksUsecases {
        public static void main(String[] args) {

                // in method arguments
                System.out.println("""
                                This is first line
                                This is second line
                                This is second line
                                """);

                // ========================================================================
                // text blocks can be used anywhere string literal can be used
                String p = "elias";
                String q = """
                                samson""";
                System.out.println(p + q);

                // ========================================================================
                // String methods can be used with text blocks

                System.out.println(p.charAt(0));

                // ========================================================================
                String name = "elias";
                double salary = 23000;

                String output = """
                                Name : %s
                                Salary: $%.2f
                                """.formatted(name, salary);
                System.out.println(output);

                // ==========================================================================
                // Refer -> https://jenkov.com/tutorials/java/strings.html search for translate in that webpage.
                // https://github.com/hantsy/java-sandbox/blob/master/docs/text-block.md
                String input = "Hey, \\n This is not normally a line break.";
                System.out.println(input);

                String res = input.translateEscapes();
                System.out.println(res);

        }
}
