package ru.oshkina.demo8;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Demo13 {
    public static void main(String[] args) {
        IntStream intStream = IntStream.of(1, 2, 3, 1, 5);

        int [] values = {1, 2, 3, 4, 5};
        intStream = Arrays.stream(values, 0, 3);

        final IntStream zeroToNinetyNine = IntStream.range(0, 100);//верхний предел не включаем
        final IntStream zeroToHundred = IntStream.rangeClosed(0, 100);//верхний предел включаем
    }
}
