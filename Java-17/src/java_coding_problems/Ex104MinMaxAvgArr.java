package java_coding_problems;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Ex104MinMaxAvgArr {

    public static void main(String[] args) {

        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8 };

        System.out.println("Sum : " + Arrays.stream(numbers).sum());
        System.out.println("Min : " + Arrays.stream(numbers).min().getAsInt());
        System.out.println("Max : " + Arrays.stream(numbers).max().getAsInt());
        System.out.println("Average : " + Arrays.stream(numbers).average().getAsDouble());

        System.out.println("Sum : " + IntStream.of(numbers).sum());
        System.out.println("Min : " + IntStream.of(numbers).min().getAsInt());
        System.out.println("Max : " + IntStream.of(numbers).max().getAsInt());
        System.out.println("Average : " + IntStream.of(numbers).average().getAsDouble());

    }
}
