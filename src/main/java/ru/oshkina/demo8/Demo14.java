package ru.oshkina.demo8;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Demo14 {
    public static void main(String[] args) {
        //Чтобы преобразовать поток данных примитивного типа в поток объектов - boxed()
        final Stream<Integer> boxed = IntStream.range(0, 100).boxed();
    }
}
